// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

// Protobuf Java Version: 3.25.5
package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code geyser.SubscribeUpdateTransactionStatus}
 */
public final class SubscribeUpdateTransactionStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:geyser.SubscribeUpdateTransactionStatus)
    SubscribeUpdateTransactionStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscribeUpdateTransactionStatus.newBuilder() to construct.
  private SubscribeUpdateTransactionStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeUpdateTransactionStatus() {
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubscribeUpdateTransactionStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateTransactionStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateTransactionStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus.class, software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus.Builder.class);
  }

  private int bitField0_;
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

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 2;</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int IS_VOTE_FIELD_NUMBER = 3;
  private boolean isVote_ = false;
  /**
   * <code>bool is_vote = 3;</code>
   * @return The isVote.
   */
  @java.lang.Override
  public boolean getIsVote() {
    return isVote_;
  }

  public static final int INDEX_FIELD_NUMBER = 4;
  private long index_ = 0L;
  /**
   * <code>uint64 index = 4;</code>
   * @return The index.
   */
  @java.lang.Override
  public long getIndex() {
    return index_;
  }

  public static final int ERR_FIELD_NUMBER = 5;
  private software.sava.grpc.geyser.generated.TransactionError err_;
  /**
   * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
   * @return Whether the err field is set.
   */
  @java.lang.Override
  public boolean hasErr() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
   * @return The err.
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.TransactionError getErr() {
    return err_ == null ? software.sava.grpc.geyser.generated.TransactionError.getDefaultInstance() : err_;
  }
  /**
   * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.TransactionErrorOrBuilder getErrOrBuilder() {
    return err_ == null ? software.sava.grpc.geyser.generated.TransactionError.getDefaultInstance() : err_;
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
    if (!signature_.isEmpty()) {
      output.writeBytes(2, signature_);
    }
    if (isVote_ != false) {
      output.writeBool(3, isVote_);
    }
    if (index_ != 0L) {
      output.writeUInt64(4, index_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getErr());
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
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, signature_);
    }
    if (isVote_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isVote_);
    }
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, index_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getErr());
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
    if (!(obj instanceof software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus other = (software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus) obj;

    if (getSlot()
        != other.getSlot()) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (getIsVote()
        != other.getIsVote()) return false;
    if (getIndex()
        != other.getIndex()) return false;
    if (hasErr() != other.hasErr()) return false;
    if (hasErr()) {
      if (!getErr()
          .equals(other.getErr())) return false;
    }
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
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + IS_VOTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsVote());
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIndex());
    if (hasErr()) {
      hash = (37 * hash) + ERR_FIELD_NUMBER;
      hash = (53 * hash) + getErr().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code geyser.SubscribeUpdateTransactionStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.SubscribeUpdateTransactionStatus)
      software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateTransactionStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateTransactionStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus.class, software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getErrFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      slot_ = 0L;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      isVote_ = false;
      index_ = 0L;
      err_ = null;
      if (errBuilder_ != null) {
        errBuilder_.dispose();
        errBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateTransactionStatus_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus build() {
      software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus buildPartial() {
      software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus result = new software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.slot_ = slot_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.signature_ = signature_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isVote_ = isVote_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.index_ = index_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.err_ = errBuilder_ == null
            ? err_
            : errBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus) {
        return mergeFrom((software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus other) {
      if (other == software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus.getDefaultInstance()) return this;
      if (other.getSlot() != 0L) {
        setSlot(other.getSlot());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.getIsVote() != false) {
        setIsVote(other.getIsVote());
      }
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
      }
      if (other.hasErr()) {
        mergeErr(other.getErr());
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
            case 18: {
              signature_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              isVote_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              index_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getErrFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 2;</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 2;</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private boolean isVote_ ;
    /**
     * <code>bool is_vote = 3;</code>
     * @return The isVote.
     */
    @java.lang.Override
    public boolean getIsVote() {
      return isVote_;
    }
    /**
     * <code>bool is_vote = 3;</code>
     * @param value The isVote to set.
     * @return This builder for chaining.
     */
    public Builder setIsVote(boolean value) {

      isVote_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_vote = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsVote() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isVote_ = false;
      onChanged();
      return this;
    }

    private long index_ ;
    /**
     * <code>uint64 index = 4;</code>
     * @return The index.
     */
    @java.lang.Override
    public long getIndex() {
      return index_;
    }
    /**
     * <code>uint64 index = 4;</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(long value) {

      index_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 index = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000008);
      index_ = 0L;
      onChanged();
      return this;
    }

    private software.sava.grpc.geyser.generated.TransactionError err_;
    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.TransactionError, software.sava.grpc.geyser.generated.TransactionError.Builder, software.sava.grpc.geyser.generated.TransactionErrorOrBuilder> errBuilder_;
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     * @return Whether the err field is set.
     */
    public boolean hasErr() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     * @return The err.
     */
    public software.sava.grpc.geyser.generated.TransactionError getErr() {
      if (errBuilder_ == null) {
        return err_ == null ? software.sava.grpc.geyser.generated.TransactionError.getDefaultInstance() : err_;
      } else {
        return errBuilder_.getMessage();
      }
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     */
    public Builder setErr(software.sava.grpc.geyser.generated.TransactionError value) {
      if (errBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        err_ = value;
      } else {
        errBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     */
    public Builder setErr(
        software.sava.grpc.geyser.generated.TransactionError.Builder builderForValue) {
      if (errBuilder_ == null) {
        err_ = builderForValue.build();
      } else {
        errBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     */
    public Builder mergeErr(software.sava.grpc.geyser.generated.TransactionError value) {
      if (errBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          err_ != null &&
          err_ != software.sava.grpc.geyser.generated.TransactionError.getDefaultInstance()) {
          getErrBuilder().mergeFrom(value);
        } else {
          err_ = value;
        }
      } else {
        errBuilder_.mergeFrom(value);
      }
      if (err_ != null) {
        bitField0_ |= 0x00000010;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     */
    public Builder clearErr() {
      bitField0_ = (bitField0_ & ~0x00000010);
      err_ = null;
      if (errBuilder_ != null) {
        errBuilder_.dispose();
        errBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     */
    public software.sava.grpc.geyser.generated.TransactionError.Builder getErrBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getErrFieldBuilder().getBuilder();
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     */
    public software.sava.grpc.geyser.generated.TransactionErrorOrBuilder getErrOrBuilder() {
      if (errBuilder_ != null) {
        return errBuilder_.getMessageOrBuilder();
      } else {
        return err_ == null ?
            software.sava.grpc.geyser.generated.TransactionError.getDefaultInstance() : err_;
      }
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.TransactionError err = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.TransactionError, software.sava.grpc.geyser.generated.TransactionError.Builder, software.sava.grpc.geyser.generated.TransactionErrorOrBuilder> 
        getErrFieldBuilder() {
      if (errBuilder_ == null) {
        errBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            software.sava.grpc.geyser.generated.TransactionError, software.sava.grpc.geyser.generated.TransactionError.Builder, software.sava.grpc.geyser.generated.TransactionErrorOrBuilder>(
                getErr(),
                getParentForChildren(),
                isClean());
        err_ = null;
      }
      return errBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:geyser.SubscribeUpdateTransactionStatus)
  }

  // @@protoc_insertion_point(class_scope:geyser.SubscribeUpdateTransactionStatus)
  private static final software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus();
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeUpdateTransactionStatus>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeUpdateTransactionStatus>() {
    @java.lang.Override
    public SubscribeUpdateTransactionStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeUpdateTransactionStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeUpdateTransactionStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeUpdateTransactionStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

