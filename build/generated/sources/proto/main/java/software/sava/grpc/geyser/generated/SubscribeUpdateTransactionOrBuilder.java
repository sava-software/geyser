// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

@com.google.protobuf.Generated
public interface SubscribeUpdateTransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeUpdateTransaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.geyser.SubscribeUpdateTransactionInfo transaction = 1;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.geyser.SubscribeUpdateTransactionInfo transaction = 1;</code>
   * @return The transaction.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateTransactionInfo getTransaction();
  /**
   * <code>.geyser.SubscribeUpdateTransactionInfo transaction = 1;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateTransactionInfoOrBuilder getTransactionOrBuilder();

  /**
   * <code>uint64 slot = 2;</code>
   * @return The slot.
   */
  long getSlot();
}
