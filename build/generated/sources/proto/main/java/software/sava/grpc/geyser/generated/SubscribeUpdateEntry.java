// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code geyser.SubscribeUpdateEntry}
 */
@com.google.protobuf.Generated
public final class SubscribeUpdateEntry extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:geyser.SubscribeUpdateEntry)
    SubscribeUpdateEntryOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      SubscribeUpdateEntry.class.getName());
  }
  // Use SubscribeUpdateEntry.newBuilder() to construct.
  private SubscribeUpdateEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SubscribeUpdateEntry() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.SubscribeUpdateEntry.class, software.sava.grpc.geyser.generated.SubscribeUpdateEntry.Builder.class);
  }

  public static final int SLOT_FIELD_NUMBER = 1;
  private long slot_ = 0L;
  /**
   * <code>uint64 slot = 1;</code>
   * @return The slot.
   */
  @java.lang.Override
  public long getSlot() {
    return slot_;
  }

  public static final int INDEX_FIELD_NUMBER = 2;
  private long index_ = 0L;
  /**
   * <code>uint64 index = 2;</code>
   * @return The index.
   */
  @java.lang.Override
  public long getIndex() {
    return index_;
  }

  public static final int NUM_HASHES_FIELD_NUMBER = 3;
  private long numHashes_ = 0L;
  /**
   * <code>uint64 num_hashes = 3;</code>
   * @return The numHashes.
   */
  @java.lang.Override
  public long getNumHashes() {
    return numHashes_;
  }

  public static final int HASH_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes hash = 4;</code>
   * @return The hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHash() {
    return hash_;
  }

  public static final int EXECUTED_TRANSACTION_COUNT_FIELD_NUMBER = 5;
  private long executedTransactionCount_ = 0L;
  /**
   * <code>uint64 executed_transaction_count = 5;</code>
   * @return The executedTransactionCount.
   */
  @java.lang.Override
  public long getExecutedTransactionCount() {
    return executedTransactionCount_;
  }

  public static final int STARTING_TRANSACTION_INDEX_FIELD_NUMBER = 6;
  private long startingTransactionIndex_ = 0L;
  /**
   * <pre>
   * added in v1.18, for solana 1.17 value is always 0
   * </pre>
   *
   * <code>uint64 starting_transaction_index = 6;</code>
   * @return The startingTransactionIndex.
   */
  @java.lang.Override
  public long getStartingTransactionIndex() {
    return startingTransactionIndex_;
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
    if (slot_ != 0L) {
      output.writeUInt64(1, slot_);
    }
    if (index_ != 0L) {
      output.writeUInt64(2, index_);
    }
    if (numHashes_ != 0L) {
      output.writeUInt64(3, numHashes_);
    }
    if (!hash_.isEmpty()) {
      output.writeBytes(4, hash_);
    }
    if (executedTransactionCount_ != 0L) {
      output.writeUInt64(5, executedTransactionCount_);
    }
    if (startingTransactionIndex_ != 0L) {
      output.writeUInt64(6, startingTransactionIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (slot_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, slot_);
    }
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, index_);
    }
    if (numHashes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, numHashes_);
    }
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, hash_);
    }
    if (executedTransactionCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, executedTransactionCount_);
    }
    if (startingTransactionIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, startingTransactionIndex_);
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
    if (!(obj instanceof software.sava.grpc.geyser.generated.SubscribeUpdateEntry)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.SubscribeUpdateEntry other = (software.sava.grpc.geyser.generated.SubscribeUpdateEntry) obj;

    if (getSlot()
        != other.getSlot()) return false;
    if (getIndex()
        != other.getIndex()) return false;
    if (getNumHashes()
        != other.getNumHashes()) return false;
    if (!getHash()
        .equals(other.getHash())) return false;
    if (getExecutedTransactionCount()
        != other.getExecutedTransactionCount()) return false;
    if (getStartingTransactionIndex()
        != other.getStartingTransactionIndex()) return false;
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
    hash = (37 * hash) + SLOT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSlot());
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIndex());
    hash = (37 * hash) + NUM_HASHES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumHashes());
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (37 * hash) + EXECUTED_TRANSACTION_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExecutedTransactionCount());
    hash = (37 * hash) + STARTING_TRANSACTION_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartingTransactionIndex());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry parseFrom(
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
  public static Builder newBuilder(software.sava.grpc.geyser.generated.SubscribeUpdateEntry prototype) {
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
   * Protobuf type {@code geyser.SubscribeUpdateEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.SubscribeUpdateEntry)
      software.sava.grpc.geyser.generated.SubscribeUpdateEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.SubscribeUpdateEntry.class, software.sava.grpc.geyser.generated.SubscribeUpdateEntry.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.SubscribeUpdateEntry.newBuilder()
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
      slot_ = 0L;
      index_ = 0L;
      numHashes_ = 0L;
      hash_ = com.google.protobuf.ByteString.EMPTY;
      executedTransactionCount_ = 0L;
      startingTransactionIndex_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateEntry_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateEntry getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.SubscribeUpdateEntry.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateEntry build() {
      software.sava.grpc.geyser.generated.SubscribeUpdateEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateEntry buildPartial() {
      software.sava.grpc.geyser.generated.SubscribeUpdateEntry result = new software.sava.grpc.geyser.generated.SubscribeUpdateEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(software.sava.grpc.geyser.generated.SubscribeUpdateEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.slot_ = slot_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.index_ = index_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numHashes_ = numHashes_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.hash_ = hash_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.executedTransactionCount_ = executedTransactionCount_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.startingTransactionIndex_ = startingTransactionIndex_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof software.sava.grpc.geyser.generated.SubscribeUpdateEntry) {
        return mergeFrom((software.sava.grpc.geyser.generated.SubscribeUpdateEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.SubscribeUpdateEntry other) {
      if (other == software.sava.grpc.geyser.generated.SubscribeUpdateEntry.getDefaultInstance()) return this;
      if (other.getSlot() != 0L) {
        setSlot(other.getSlot());
      }
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
      }
      if (other.getNumHashes() != 0L) {
        setNumHashes(other.getNumHashes());
      }
      if (!other.getHash().isEmpty()) {
        setHash(other.getHash());
      }
      if (other.getExecutedTransactionCount() != 0L) {
        setExecutedTransactionCount(other.getExecutedTransactionCount());
      }
      if (other.getStartingTransactionIndex() != 0L) {
        setStartingTransactionIndex(other.getStartingTransactionIndex());
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
              slot_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              index_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              numHashes_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              hash_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              executedTransactionCount_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              startingTransactionIndex_ = input.readUInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private long slot_ ;
    /**
     * <code>uint64 slot = 1;</code>
     * @return The slot.
     */
    @java.lang.Override
    public long getSlot() {
      return slot_;
    }
    /**
     * <code>uint64 slot = 1;</code>
     * @param value The slot to set.
     * @return This builder for chaining.
     */
    public Builder setSlot(long value) {

      slot_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 slot = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSlot() {
      bitField0_ = (bitField0_ & ~0x00000001);
      slot_ = 0L;
      onChanged();
      return this;
    }

    private long index_ ;
    /**
     * <code>uint64 index = 2;</code>
     * @return The index.
     */
    @java.lang.Override
    public long getIndex() {
      return index_;
    }
    /**
     * <code>uint64 index = 2;</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(long value) {

      index_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 index = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      index_ = 0L;
      onChanged();
      return this;
    }

    private long numHashes_ ;
    /**
     * <code>uint64 num_hashes = 3;</code>
     * @return The numHashes.
     */
    @java.lang.Override
    public long getNumHashes() {
      return numHashes_;
    }
    /**
     * <code>uint64 num_hashes = 3;</code>
     * @param value The numHashes to set.
     * @return This builder for chaining.
     */
    public Builder setNumHashes(long value) {

      numHashes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 num_hashes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumHashes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numHashes_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hash = 4;</code>
     * @return The hash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }
    /**
     * <code>bytes hash = 4;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes hash = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      bitField0_ = (bitField0_ & ~0x00000008);
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }

    private long executedTransactionCount_ ;
    /**
     * <code>uint64 executed_transaction_count = 5;</code>
     * @return The executedTransactionCount.
     */
    @java.lang.Override
    public long getExecutedTransactionCount() {
      return executedTransactionCount_;
    }
    /**
     * <code>uint64 executed_transaction_count = 5;</code>
     * @param value The executedTransactionCount to set.
     * @return This builder for chaining.
     */
    public Builder setExecutedTransactionCount(long value) {

      executedTransactionCount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 executed_transaction_count = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutedTransactionCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      executedTransactionCount_ = 0L;
      onChanged();
      return this;
    }

    private long startingTransactionIndex_ ;
    /**
     * <pre>
     * added in v1.18, for solana 1.17 value is always 0
     * </pre>
     *
     * <code>uint64 starting_transaction_index = 6;</code>
     * @return The startingTransactionIndex.
     */
    @java.lang.Override
    public long getStartingTransactionIndex() {
      return startingTransactionIndex_;
    }
    /**
     * <pre>
     * added in v1.18, for solana 1.17 value is always 0
     * </pre>
     *
     * <code>uint64 starting_transaction_index = 6;</code>
     * @param value The startingTransactionIndex to set.
     * @return This builder for chaining.
     */
    public Builder setStartingTransactionIndex(long value) {

      startingTransactionIndex_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * added in v1.18, for solana 1.17 value is always 0
     * </pre>
     *
     * <code>uint64 starting_transaction_index = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartingTransactionIndex() {
      bitField0_ = (bitField0_ & ~0x00000020);
      startingTransactionIndex_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:geyser.SubscribeUpdateEntry)
  }

  // @@protoc_insertion_point(class_scope:geyser.SubscribeUpdateEntry)
  private static final software.sava.grpc.geyser.generated.SubscribeUpdateEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.SubscribeUpdateEntry();
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeUpdateEntry>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeUpdateEntry>() {
    @java.lang.Override
    public SubscribeUpdateEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeUpdateEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeUpdateEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeUpdateEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

