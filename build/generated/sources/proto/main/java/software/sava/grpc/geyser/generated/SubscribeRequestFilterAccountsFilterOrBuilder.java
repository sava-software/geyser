// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

@com.google.protobuf.Generated
public interface SubscribeRequestFilterAccountsFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeRequestFilterAccountsFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
   * @return Whether the memcmp field is set.
   */
  boolean hasMemcmp();
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
   * @return The memcmp.
   */
  software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp getMemcmp();
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmpOrBuilder getMemcmpOrBuilder();

  /**
   * <code>uint64 datasize = 2;</code>
   * @return Whether the datasize field is set.
   */
  boolean hasDatasize();
  /**
   * <code>uint64 datasize = 2;</code>
   * @return The datasize.
   */
  long getDatasize();

  /**
   * <code>bool token_account_state = 3;</code>
   * @return Whether the tokenAccountState field is set.
   */
  boolean hasTokenAccountState();
  /**
   * <code>bool token_account_state = 3;</code>
   * @return The tokenAccountState.
   */
  boolean getTokenAccountState();

  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
   * @return Whether the lamports field is set.
   */
  boolean hasLamports();
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
   * @return The lamports.
   */
  software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports getLamports();
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamportsOrBuilder getLamportsOrBuilder();

  software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.FilterCase getFilterCase();
}
