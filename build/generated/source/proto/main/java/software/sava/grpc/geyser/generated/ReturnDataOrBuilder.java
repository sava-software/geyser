// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

// Protobuf Java Version: 3.25.5
package software.sava.grpc.geyser.generated;

public interface ReturnDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:solana.storage.ConfirmedBlock.ReturnData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes program_id = 1;</code>
   * @return The programId.
   */
  com.google.protobuf.ByteString getProgramId();

  /**
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
