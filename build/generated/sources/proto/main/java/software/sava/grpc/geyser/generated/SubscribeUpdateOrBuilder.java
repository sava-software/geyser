// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

@com.google.protobuf.Generated
public interface SubscribeUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string filters = 1;</code>
   * @return A list containing the filters.
   */
  java.util.List<java.lang.String>
      getFiltersList();
  /**
   * <code>repeated string filters = 1;</code>
   * @return The count of filters.
   */
  int getFiltersCount();
  /**
   * <code>repeated string filters = 1;</code>
   * @param index The index of the element to return.
   * @return The filters at the given index.
   */
  java.lang.String getFilters(int index);
  /**
   * <code>repeated string filters = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the filters at the given index.
   */
  com.google.protobuf.ByteString
      getFiltersBytes(int index);

  /**
   * <code>.geyser.SubscribeUpdateAccount account = 2;</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <code>.geyser.SubscribeUpdateAccount account = 2;</code>
   * @return The account.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateAccount getAccount();
  /**
   * <code>.geyser.SubscribeUpdateAccount account = 2;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateAccountOrBuilder getAccountOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdateSlot slot = 3;</code>
   * @return Whether the slot field is set.
   */
  boolean hasSlot();
  /**
   * <code>.geyser.SubscribeUpdateSlot slot = 3;</code>
   * @return The slot.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateSlot getSlot();
  /**
   * <code>.geyser.SubscribeUpdateSlot slot = 3;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateSlotOrBuilder getSlotOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdateTransaction transaction = 4;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.geyser.SubscribeUpdateTransaction transaction = 4;</code>
   * @return The transaction.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateTransaction getTransaction();
  /**
   * <code>.geyser.SubscribeUpdateTransaction transaction = 4;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateTransactionOrBuilder getTransactionOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdateTransactionStatus transaction_status = 10;</code>
   * @return Whether the transactionStatus field is set.
   */
  boolean hasTransactionStatus();
  /**
   * <code>.geyser.SubscribeUpdateTransactionStatus transaction_status = 10;</code>
   * @return The transactionStatus.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus getTransactionStatus();
  /**
   * <code>.geyser.SubscribeUpdateTransactionStatus transaction_status = 10;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatusOrBuilder getTransactionStatusOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdateBlock block = 5;</code>
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   * <code>.geyser.SubscribeUpdateBlock block = 5;</code>
   * @return The block.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateBlock getBlock();
  /**
   * <code>.geyser.SubscribeUpdateBlock block = 5;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateBlockOrBuilder getBlockOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdatePing ping = 6;</code>
   * @return Whether the ping field is set.
   */
  boolean hasPing();
  /**
   * <code>.geyser.SubscribeUpdatePing ping = 6;</code>
   * @return The ping.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdatePing getPing();
  /**
   * <code>.geyser.SubscribeUpdatePing ping = 6;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdatePingOrBuilder getPingOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdatePong pong = 9;</code>
   * @return Whether the pong field is set.
   */
  boolean hasPong();
  /**
   * <code>.geyser.SubscribeUpdatePong pong = 9;</code>
   * @return The pong.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdatePong getPong();
  /**
   * <code>.geyser.SubscribeUpdatePong pong = 9;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdatePongOrBuilder getPongOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdateBlockMeta block_meta = 7;</code>
   * @return Whether the blockMeta field is set.
   */
  boolean hasBlockMeta();
  /**
   * <code>.geyser.SubscribeUpdateBlockMeta block_meta = 7;</code>
   * @return The blockMeta.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateBlockMeta getBlockMeta();
  /**
   * <code>.geyser.SubscribeUpdateBlockMeta block_meta = 7;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateBlockMetaOrBuilder getBlockMetaOrBuilder();

  /**
   * <code>.geyser.SubscribeUpdateEntry entry = 8;</code>
   * @return Whether the entry field is set.
   */
  boolean hasEntry();
  /**
   * <code>.geyser.SubscribeUpdateEntry entry = 8;</code>
   * @return The entry.
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateEntry getEntry();
  /**
   * <code>.geyser.SubscribeUpdateEntry entry = 8;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeUpdateEntryOrBuilder getEntryOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp created_at = 11;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 11;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  software.sava.grpc.geyser.generated.SubscribeUpdate.UpdateOneofCase getUpdateOneofCase();
}
