// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

// Protobuf Java Version: 3.25.5
package software.sava.grpc.geyser.generated;

public interface SubscribeRequestFilterAccountsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeRequestFilterAccounts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string account = 2;</code>
   * @return A list containing the account.
   */
  java.util.List<java.lang.String>
      getAccountList();
  /**
   * <code>repeated string account = 2;</code>
   * @return The count of account.
   */
  int getAccountCount();
  /**
   * <code>repeated string account = 2;</code>
   * @param index The index of the element to return.
   * @return The account at the given index.
   */
  java.lang.String getAccount(int index);
  /**
   * <code>repeated string account = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the account at the given index.
   */
  com.google.protobuf.ByteString
      getAccountBytes(int index);

  /**
   * <code>repeated string owner = 3;</code>
   * @return A list containing the owner.
   */
  java.util.List<java.lang.String>
      getOwnerList();
  /**
   * <code>repeated string owner = 3;</code>
   * @return The count of owner.
   */
  int getOwnerCount();
  /**
   * <code>repeated string owner = 3;</code>
   * @param index The index of the element to return.
   * @return The owner at the given index.
   */
  java.lang.String getOwner(int index);
  /**
   * <code>repeated string owner = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the owner at the given index.
   */
  com.google.protobuf.ByteString
      getOwnerBytes(int index);

  /**
   * <code>repeated .geyser.SubscribeRequestFilterAccountsFilter filters = 4;</code>
   */
  java.util.List<software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter> 
      getFiltersList();
  /**
   * <code>repeated .geyser.SubscribeRequestFilterAccountsFilter filters = 4;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter getFilters(int index);
  /**
   * <code>repeated .geyser.SubscribeRequestFilterAccountsFilter filters = 4;</code>
   */
  int getFiltersCount();
  /**
   * <code>repeated .geyser.SubscribeRequestFilterAccountsFilter filters = 4;</code>
   */
  java.util.List<? extends software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <code>repeated .geyser.SubscribeRequestFilterAccountsFilter filters = 4;</code>
   */
  software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterOrBuilder getFiltersOrBuilder(
      int index);

  /**
   * <code>optional bool nonempty_txn_signature = 5;</code>
   * @return Whether the nonemptyTxnSignature field is set.
   */
  boolean hasNonemptyTxnSignature();
  /**
   * <code>optional bool nonempty_txn_signature = 5;</code>
   * @return The nonemptyTxnSignature.
   */
  boolean getNonemptyTxnSignature();
}
