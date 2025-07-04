// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

@com.google.protobuf.Generated
public interface SubscribeUpdateTransactionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeUpdateTransactionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes signature = 1;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <code>bool is_vote = 2;</code>
   * @return The isVote.
   */
  boolean getIsVote();

  /**
   * <code>.solana.storage.ConfirmedBlock.Transaction transaction = 3;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.solana.storage.ConfirmedBlock.Transaction transaction = 3;</code>
   * @return The transaction.
   */
  software.sava.grpc.geyser.generated.Transaction getTransaction();
  /**
   * <code>.solana.storage.ConfirmedBlock.Transaction transaction = 3;</code>
   */
  software.sava.grpc.geyser.generated.TransactionOrBuilder getTransactionOrBuilder();

  /**
   * <code>.solana.storage.ConfirmedBlock.TransactionStatusMeta meta = 4;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <code>.solana.storage.ConfirmedBlock.TransactionStatusMeta meta = 4;</code>
   * @return The meta.
   */
  software.sava.grpc.geyser.generated.TransactionStatusMeta getMeta();
  /**
   * <code>.solana.storage.ConfirmedBlock.TransactionStatusMeta meta = 4;</code>
   */
  software.sava.grpc.geyser.generated.TransactionStatusMetaOrBuilder getMetaOrBuilder();

  /**
   * <code>uint64 index = 5;</code>
   * @return The index.
   */
  long getIndex();
}
