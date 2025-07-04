// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code geyser.SubscribeUpdateSlot}
 */
@com.google.protobuf.Generated
public final class SubscribeUpdateSlot extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:geyser.SubscribeUpdateSlot)
    SubscribeUpdateSlotOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      SubscribeUpdateSlot.class.getName());
  }
  // Use SubscribeUpdateSlot.newBuilder() to construct.
  private SubscribeUpdateSlot(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SubscribeUpdateSlot() {
    status_ = 0;
    deadError_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateSlot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateSlot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.SubscribeUpdateSlot.class, software.sava.grpc.geyser.generated.SubscribeUpdateSlot.Builder.class);
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

  public static final int PARENT_FIELD_NUMBER = 2;
  private long parent_ = 0L;
  /**
   * <code>optional uint64 parent = 2;</code>
   * @return Whether the parent field is set.
   */
  @java.lang.Override
  public boolean hasParent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional uint64 parent = 2;</code>
   * @return The parent.
   */
  @java.lang.Override
  public long getParent() {
    return parent_;
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_ = 0;
  /**
   * <code>.geyser.SlotStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.geyser.SlotStatus status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public software.sava.grpc.geyser.generated.SlotStatus getStatus() {
    software.sava.grpc.geyser.generated.SlotStatus result = software.sava.grpc.geyser.generated.SlotStatus.forNumber(status_);
    return result == null ? software.sava.grpc.geyser.generated.SlotStatus.UNRECOGNIZED : result;
  }

  public static final int DEAD_ERROR_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deadError_ = "";
  /**
   * <code>optional string dead_error = 4;</code>
   * @return Whether the deadError field is set.
   */
  @java.lang.Override
  public boolean hasDeadError() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string dead_error = 4;</code>
   * @return The deadError.
   */
  @java.lang.Override
  public java.lang.String getDeadError() {
    java.lang.Object ref = deadError_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deadError_ = s;
      return s;
    }
  }
  /**
   * <code>optional string dead_error = 4;</code>
   * @return The bytes for deadError.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeadErrorBytes() {
    java.lang.Object ref = deadError_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deadError_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt64(2, parent_);
    }
    if (status_ != software.sava.grpc.geyser.generated.SlotStatus.SLOT_PROCESSED.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, deadError_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, parent_);
    }
    if (status_ != software.sava.grpc.geyser.generated.SlotStatus.SLOT_PROCESSED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, deadError_);
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
    if (!(obj instanceof software.sava.grpc.geyser.generated.SubscribeUpdateSlot)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.SubscribeUpdateSlot other = (software.sava.grpc.geyser.generated.SubscribeUpdateSlot) obj;

    if (getSlot()
        != other.getSlot()) return false;
    if (hasParent() != other.hasParent()) return false;
    if (hasParent()) {
      if (getParent()
          != other.getParent()) return false;
    }
    if (status_ != other.status_) return false;
    if (hasDeadError() != other.hasDeadError()) return false;
    if (hasDeadError()) {
      if (!getDeadError()
          .equals(other.getDeadError())) return false;
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
    if (hasParent()) {
      hash = (37 * hash) + PARENT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getParent());
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasDeadError()) {
      hash = (37 * hash) + DEAD_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getDeadError().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot parseFrom(
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
  public static Builder newBuilder(software.sava.grpc.geyser.generated.SubscribeUpdateSlot prototype) {
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
   * Protobuf type {@code geyser.SubscribeUpdateSlot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.SubscribeUpdateSlot)
      software.sava.grpc.geyser.generated.SubscribeUpdateSlotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateSlot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateSlot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.SubscribeUpdateSlot.class, software.sava.grpc.geyser.generated.SubscribeUpdateSlot.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.SubscribeUpdateSlot.newBuilder()
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
      parent_ = 0L;
      status_ = 0;
      deadError_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdateSlot_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateSlot getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.SubscribeUpdateSlot.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateSlot build() {
      software.sava.grpc.geyser.generated.SubscribeUpdateSlot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdateSlot buildPartial() {
      software.sava.grpc.geyser.generated.SubscribeUpdateSlot result = new software.sava.grpc.geyser.generated.SubscribeUpdateSlot(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(software.sava.grpc.geyser.generated.SubscribeUpdateSlot result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.slot_ = slot_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parent_ = parent_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.deadError_ = deadError_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof software.sava.grpc.geyser.generated.SubscribeUpdateSlot) {
        return mergeFrom((software.sava.grpc.geyser.generated.SubscribeUpdateSlot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.SubscribeUpdateSlot other) {
      if (other == software.sava.grpc.geyser.generated.SubscribeUpdateSlot.getDefaultInstance()) return this;
      if (other.getSlot() != 0L) {
        setSlot(other.getSlot());
      }
      if (other.hasParent()) {
        setParent(other.getParent());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasDeadError()) {
        deadError_ = other.deadError_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              parent_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              deadError_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long parent_ ;
    /**
     * <code>optional uint64 parent = 2;</code>
     * @return Whether the parent field is set.
     */
    @java.lang.Override
    public boolean hasParent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint64 parent = 2;</code>
     * @return The parent.
     */
    @java.lang.Override
    public long getParent() {
      return parent_;
    }
    /**
     * <code>optional uint64 parent = 2;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(long value) {

      parent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 parent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      parent_ = 0L;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.geyser.SlotStatus status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.geyser.SlotStatus status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.geyser.SlotStatus status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public software.sava.grpc.geyser.generated.SlotStatus getStatus() {
      software.sava.grpc.geyser.generated.SlotStatus result = software.sava.grpc.geyser.generated.SlotStatus.forNumber(status_);
      return result == null ? software.sava.grpc.geyser.generated.SlotStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.geyser.SlotStatus status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(software.sava.grpc.geyser.generated.SlotStatus value) {
      if (value == null) { throw new NullPointerException(); }
      bitField0_ |= 0x00000004;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.geyser.SlotStatus status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object deadError_ = "";
    /**
     * <code>optional string dead_error = 4;</code>
     * @return Whether the deadError field is set.
     */
    public boolean hasDeadError() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string dead_error = 4;</code>
     * @return The deadError.
     */
    public java.lang.String getDeadError() {
      java.lang.Object ref = deadError_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deadError_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string dead_error = 4;</code>
     * @return The bytes for deadError.
     */
    public com.google.protobuf.ByteString
        getDeadErrorBytes() {
      java.lang.Object ref = deadError_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deadError_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string dead_error = 4;</code>
     * @param value The deadError to set.
     * @return This builder for chaining.
     */
    public Builder setDeadError(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deadError_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional string dead_error = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeadError() {
      deadError_ = getDefaultInstance().getDeadError();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>optional string dead_error = 4;</code>
     * @param value The bytes for deadError to set.
     * @return This builder for chaining.
     */
    public Builder setDeadErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deadError_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:geyser.SubscribeUpdateSlot)
  }

  // @@protoc_insertion_point(class_scope:geyser.SubscribeUpdateSlot)
  private static final software.sava.grpc.geyser.generated.SubscribeUpdateSlot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.SubscribeUpdateSlot();
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdateSlot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeUpdateSlot>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeUpdateSlot>() {
    @java.lang.Override
    public SubscribeUpdateSlot parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeUpdateSlot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeUpdateSlot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeUpdateSlot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

