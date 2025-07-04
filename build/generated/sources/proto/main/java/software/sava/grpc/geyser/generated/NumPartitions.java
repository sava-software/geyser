// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: solana-storage.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code solana.storage.ConfirmedBlock.NumPartitions}
 */
@com.google.protobuf.Generated
public final class NumPartitions extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:solana.storage.ConfirmedBlock.NumPartitions)
    NumPartitionsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      NumPartitions.class.getName());
  }
  // Use NumPartitions.newBuilder() to construct.
  private NumPartitions(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private NumPartitions() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_NumPartitions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_NumPartitions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.NumPartitions.class, software.sava.grpc.geyser.generated.NumPartitions.Builder.class);
  }

  public static final int NUM_PARTITIONS_FIELD_NUMBER = 1;
  private long numPartitions_ = 0L;
  /**
   * <code>uint64 num_partitions = 1;</code>
   * @return The numPartitions.
   */
  @java.lang.Override
  public long getNumPartitions() {
    return numPartitions_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (numPartitions_ != 0L) {
      output.writeUInt64(1, numPartitions_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numPartitions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, numPartitions_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof software.sava.grpc.geyser.generated.NumPartitions)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.NumPartitions other = (software.sava.grpc.geyser.generated.NumPartitions) obj;

    if (getNumPartitions()
        != other.getNumPartitions()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUM_PARTITIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumPartitions());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.NumPartitions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.NumPartitions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.NumPartitions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(software.sava.grpc.geyser.generated.NumPartitions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code solana.storage.ConfirmedBlock.NumPartitions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:solana.storage.ConfirmedBlock.NumPartitions)
      software.sava.grpc.geyser.generated.NumPartitionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_NumPartitions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_NumPartitions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.NumPartitions.class, software.sava.grpc.geyser.generated.NumPartitions.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.NumPartitions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      numPartitions_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_NumPartitions_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.NumPartitions getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.NumPartitions.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.NumPartitions build() {
      software.sava.grpc.geyser.generated.NumPartitions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.NumPartitions buildPartial() {
      software.sava.grpc.geyser.generated.NumPartitions result = new software.sava.grpc.geyser.generated.NumPartitions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(software.sava.grpc.geyser.generated.NumPartitions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numPartitions_ = numPartitions_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof software.sava.grpc.geyser.generated.NumPartitions) {
        return mergeFrom((software.sava.grpc.geyser.generated.NumPartitions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.NumPartitions other) {
      if (other == software.sava.grpc.geyser.generated.NumPartitions.getDefaultInstance()) return this;
      if (other.getNumPartitions() != 0L) {
        setNumPartitions(other.getNumPartitions());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              numPartitions_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long numPartitions_ ;
    /**
     * <code>uint64 num_partitions = 1;</code>
     * @return The numPartitions.
     */
    @java.lang.Override
    public long getNumPartitions() {
      return numPartitions_;
    }
    /**
     * <code>uint64 num_partitions = 1;</code>
     * @param value The numPartitions to set.
     * @return This builder for chaining.
     */
    public Builder setNumPartitions(long value) {

      numPartitions_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 num_partitions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumPartitions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numPartitions_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:solana.storage.ConfirmedBlock.NumPartitions)
  }

  // @@protoc_insertion_point(class_scope:solana.storage.ConfirmedBlock.NumPartitions)
  private static final software.sava.grpc.geyser.generated.NumPartitions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.NumPartitions();
  }

  public static software.sava.grpc.geyser.generated.NumPartitions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NumPartitions>
      PARSER = new com.google.protobuf.AbstractParser<NumPartitions>() {
    @java.lang.Override
    public NumPartitions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<NumPartitions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NumPartitions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.NumPartitions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

