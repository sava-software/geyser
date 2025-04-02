// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

// Protobuf Java Version: 3.25.5
package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code geyser.IsBlockhashValidRequest}
 */
public final class IsBlockhashValidRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:geyser.IsBlockhashValidRequest)
    IsBlockhashValidRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IsBlockhashValidRequest.newBuilder() to construct.
  private IsBlockhashValidRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IsBlockhashValidRequest() {
    blockhash_ = "";
    commitment_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IsBlockhashValidRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_IsBlockhashValidRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_IsBlockhashValidRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.IsBlockhashValidRequest.class, software.sava.grpc.geyser.generated.IsBlockhashValidRequest.Builder.class);
  }

  private int bitField0_;
  public static final int BLOCKHASH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object blockhash_ = "";
  /**
   * <code>string blockhash = 1;</code>
   * @return The blockhash.
   */
  @java.lang.Override
  public java.lang.String getBlockhash() {
    java.lang.Object ref = blockhash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      blockhash_ = s;
      return s;
    }
  }
  /**
   * <code>string blockhash = 1;</code>
   * @return The bytes for blockhash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBlockhashBytes() {
    java.lang.Object ref = blockhash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      blockhash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMITMENT_FIELD_NUMBER = 2;
  private int commitment_ = 0;
  /**
   * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
   * @return Whether the commitment field is set.
   */
  @java.lang.Override public boolean hasCommitment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
   * @return The enum numeric value on the wire for commitment.
   */
  @java.lang.Override public int getCommitmentValue() {
    return commitment_;
  }
  /**
   * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
   * @return The commitment.
   */
  @java.lang.Override public software.sava.grpc.geyser.generated.CommitmentLevel getCommitment() {
    software.sava.grpc.geyser.generated.CommitmentLevel result = software.sava.grpc.geyser.generated.CommitmentLevel.forNumber(commitment_);
    return result == null ? software.sava.grpc.geyser.generated.CommitmentLevel.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(blockhash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, blockhash_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(2, commitment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(blockhash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, blockhash_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, commitment_);
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
    if (!(obj instanceof software.sava.grpc.geyser.generated.IsBlockhashValidRequest)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.IsBlockhashValidRequest other = (software.sava.grpc.geyser.generated.IsBlockhashValidRequest) obj;

    if (!getBlockhash()
        .equals(other.getBlockhash())) return false;
    if (hasCommitment() != other.hasCommitment()) return false;
    if (hasCommitment()) {
      if (commitment_ != other.commitment_) return false;
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
    hash = (37 * hash) + BLOCKHASH_FIELD_NUMBER;
    hash = (53 * hash) + getBlockhash().hashCode();
    if (hasCommitment()) {
      hash = (37 * hash) + COMMITMENT_FIELD_NUMBER;
      hash = (53 * hash) + commitment_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest parseFrom(
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
  public static Builder newBuilder(software.sava.grpc.geyser.generated.IsBlockhashValidRequest prototype) {
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
   * Protobuf type {@code geyser.IsBlockhashValidRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.IsBlockhashValidRequest)
      software.sava.grpc.geyser.generated.IsBlockhashValidRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_IsBlockhashValidRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_IsBlockhashValidRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.IsBlockhashValidRequest.class, software.sava.grpc.geyser.generated.IsBlockhashValidRequest.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.IsBlockhashValidRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      blockhash_ = "";
      commitment_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_IsBlockhashValidRequest_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.IsBlockhashValidRequest getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.IsBlockhashValidRequest.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.IsBlockhashValidRequest build() {
      software.sava.grpc.geyser.generated.IsBlockhashValidRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.IsBlockhashValidRequest buildPartial() {
      software.sava.grpc.geyser.generated.IsBlockhashValidRequest result = new software.sava.grpc.geyser.generated.IsBlockhashValidRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(software.sava.grpc.geyser.generated.IsBlockhashValidRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blockhash_ = blockhash_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commitment_ = commitment_;
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
      if (other instanceof software.sava.grpc.geyser.generated.IsBlockhashValidRequest) {
        return mergeFrom((software.sava.grpc.geyser.generated.IsBlockhashValidRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.IsBlockhashValidRequest other) {
      if (other == software.sava.grpc.geyser.generated.IsBlockhashValidRequest.getDefaultInstance()) return this;
      if (!other.getBlockhash().isEmpty()) {
        blockhash_ = other.blockhash_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCommitment()) {
        setCommitment(other.getCommitment());
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
            case 10: {
              blockhash_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              commitment_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object blockhash_ = "";
    /**
     * <code>string blockhash = 1;</code>
     * @return The blockhash.
     */
    public java.lang.String getBlockhash() {
      java.lang.Object ref = blockhash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        blockhash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string blockhash = 1;</code>
     * @return The bytes for blockhash.
     */
    public com.google.protobuf.ByteString
        getBlockhashBytes() {
      java.lang.Object ref = blockhash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blockhash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string blockhash = 1;</code>
     * @param value The blockhash to set.
     * @return This builder for chaining.
     */
    public Builder setBlockhash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      blockhash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string blockhash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockhash() {
      blockhash_ = getDefaultInstance().getBlockhash();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string blockhash = 1;</code>
     * @param value The bytes for blockhash to set.
     * @return This builder for chaining.
     */
    public Builder setBlockhashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      blockhash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int commitment_ = 0;
    /**
     * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
     * @return Whether the commitment field is set.
     */
    @java.lang.Override public boolean hasCommitment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
     * @return The enum numeric value on the wire for commitment.
     */
    @java.lang.Override public int getCommitmentValue() {
      return commitment_;
    }
    /**
     * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
     * @param value The enum numeric value on the wire for commitment to set.
     * @return This builder for chaining.
     */
    public Builder setCommitmentValue(int value) {
      commitment_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
     * @return The commitment.
     */
    @java.lang.Override
    public software.sava.grpc.geyser.generated.CommitmentLevel getCommitment() {
      software.sava.grpc.geyser.generated.CommitmentLevel result = software.sava.grpc.geyser.generated.CommitmentLevel.forNumber(commitment_);
      return result == null ? software.sava.grpc.geyser.generated.CommitmentLevel.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
     * @param value The commitment to set.
     * @return This builder for chaining.
     */
    public Builder setCommitment(software.sava.grpc.geyser.generated.CommitmentLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      commitment_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .geyser.CommitmentLevel commitment = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommitment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      commitment_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:geyser.IsBlockhashValidRequest)
  }

  // @@protoc_insertion_point(class_scope:geyser.IsBlockhashValidRequest)
  private static final software.sava.grpc.geyser.generated.IsBlockhashValidRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.IsBlockhashValidRequest();
  }

  public static software.sava.grpc.geyser.generated.IsBlockhashValidRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IsBlockhashValidRequest>
      PARSER = new com.google.protobuf.AbstractParser<IsBlockhashValidRequest>() {
    @java.lang.Override
    public IsBlockhashValidRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<IsBlockhashValidRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IsBlockhashValidRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.IsBlockhashValidRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

