package software.sava.grpc.geyser;

import io.grpc.Grpc;
import io.grpc.TlsChannelCredentials;
import io.grpc.stub.StreamObserver;
import software.sava.core.accounts.PublicKey;
import software.sava.core.accounts.SolanaAccounts;
import software.sava.core.encoding.Base58;
import software.sava.core.encoding.ByteUtil;
import software.sava.grpc.geyser.generated.*;
import software.sava.solana.programs.compute_budget.ComputeBudgetProgram;

import java.util.Base64;
import java.util.concurrent.ExecutionException;

public final class HelloGeyser {

  public static void main(final String[] args) throws ExecutionException, InterruptedException {
    final var watchAddress = "LBUZKhRxPF3XUpBCjp4YzTKgLccjZhTSDM9YuVaPwxo";
    final var hostPort = "solana-yellowstone-grpc.publicnode.com:443";
    final var channel = Grpc.newChannelBuilder(hostPort, TlsChannelCredentials.create()).build();

    final var stub = GeyserGrpc.newStub(channel);
    final var solanaAccounts = SolanaAccounts.MAIN_NET;
    final var computeBudgetProgram = solanaAccounts.computeBudgetProgram();
    final var cbInstructions = ComputeBudgetProgram.Instructions.values();
    final var subscribe = stub.subscribe(new StreamObserver<>() {

      @Override
      public void onNext(final SubscribeUpdate tx) {
        final var transaction = tx.getTransaction().getTransaction();
        System.out.println(Base58.encode(transaction.getSignature().toByteArray()));

        final var message = transaction.getTransaction().getMessage();
        int i = 0;
        for (final var ix : message.getInstructionsList()) {
          final var program = PublicKey.readPubKey(message.getAccountKeys(ix.getProgramIdIndex()).toByteArray());
          final byte[] ixData = ix.getData().toByteArray();
          System.out.printf("""
                  %d: %s %s
                  """,
              i++, program, Base64.getEncoder().encodeToString(ixData)
          );

          if (program.equals(computeBudgetProgram)) {
            final int discriminator = ixData[0] & 0xFF;
            switch (cbInstructions[discriminator]) {
              case Unused -> {
              }
              case RequestHeapFrame -> System.out.println("Heap frame request: " + ByteUtil.getInt32LE(ixData, 1));
              case SetComputeUnitLimit -> System.out.println("Compute unit limit: " + ByteUtil.getInt32LE(ixData, 1));
              case SetComputeUnitPrice -> System.out.println("Compute unit price: " + ByteUtil.getInt64LE(ixData, 1));
              case SetLoadedAccountsDataSizeLimit ->
                  System.out.println("Loaded accounts data size limit: " + ByteUtil.getInt32LE(ixData, 1));
            }
          }
        }
        System.out.println();
      }

      @Override
      public void onError(final Throwable t) {
        System.err.println("Subscription error: " + t.getMessage());
      }

      @Override
      public void onCompleted() {
        System.out.println("Subscription completed");
      }
    });

    final var txSubscriptionRequest = SubscribeRequest.newBuilder()
        .setCommitment(CommitmentLevel.CONFIRMED)
        .putTransactions("transactions_sub", SubscribeRequestFilterTransactions
            .newBuilder()
            .addAccountInclude(watchAddress)
            .build()
        ).build();
    subscribe.onNext(txSubscriptionRequest);

    Thread.sleep(Integer.MAX_VALUE);
  }

  private HelloGeyser() {
  }
}
