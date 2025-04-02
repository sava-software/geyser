package software.sava.grpc.geyser;

import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.stub.StreamObserver;
import software.sava.core.encoding.Base58;
import software.sava.grpc.*;

import java.util.concurrent.ExecutionException;

public final class HelloGeyser {

  public static void main(final String[] args) throws ExecutionException, InterruptedException {
    final var hostPort = "";
    final var channel = Grpc.newChannelBuilder(hostPort, InsecureChannelCredentials.create()).build();

//    io.grpc.StatusRuntimeException: UNIMPLEMENTED: Method geyser.Geyser/GetLatestBlockhash is unimplemented
//    final var geyserClient = GeyserGrpc.newFutureStub(channel);
//    final var response = geyserClient.getLatestBlockhash(GetLatestBlockhashRequest.getDefaultInstance()).get();
//    System.out.println(response);

    final var stub = GeyserGrpc.newStub(channel);
    final var subscribe = stub.subscribe(new StreamObserver<>() {
      @Override
      public void onNext(final SubscribeUpdate tx) {
        System.out.println(Base58.encode(tx.getTransaction().getTransaction().getSignature().toByteArray()));
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

    final var request = SubscribeRequest.newBuilder()
        .setCommitment(CommitmentLevel.CONFIRMED)
        .putTransactions("transactions_sub", SubscribeRequestFilterTransactions
            .newBuilder()
            .addAccountInclude("LBUZKhRxPF3XUpBCjp4YzTKgLccjZhTSDM9YuVaPwxo")
            .build()
        ).build();
    subscribe.onNext(request);

    Thread.sleep(Integer.MAX_VALUE);
  }

  private HelloGeyser() {
  }
}
