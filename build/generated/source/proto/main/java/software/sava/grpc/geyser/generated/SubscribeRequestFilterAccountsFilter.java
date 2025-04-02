// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

// Protobuf Java Version: 3.25.5
package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code geyser.SubscribeRequestFilterAccountsFilter}
 */
public final class SubscribeRequestFilterAccountsFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:geyser.SubscribeRequestFilterAccountsFilter)
    SubscribeRequestFilterAccountsFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscribeRequestFilterAccountsFilter.newBuilder() to construct.
  private SubscribeRequestFilterAccountsFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeRequestFilterAccountsFilter() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubscribeRequestFilterAccountsFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeRequestFilterAccountsFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeRequestFilterAccountsFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.class, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.Builder.class);
  }

  private int filterCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object filter_;
  public enum FilterCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MEMCMP(1),
    DATASIZE(2),
    TOKEN_ACCOUNT_STATE(3),
    LAMPORTS(4),
    FILTER_NOT_SET(0);
    private final int value;
    private FilterCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FilterCase valueOf(int value) {
      return forNumber(value);
    }

    public static FilterCase forNumber(int value) {
      switch (value) {
        case 1: return MEMCMP;
        case 2: return DATASIZE;
        case 3: return TOKEN_ACCOUNT_STATE;
        case 4: return LAMPORTS;
        case 0: return FILTER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FilterCase
  getFilterCase() {
    return FilterCase.forNumber(
        filterCase_);
  }

  public static final int MEMCMP_FIELD_NUMBER = 1;
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
   * @return Whether the memcmp field is set.
   */
  @java.lang.Override
  public boolean hasMemcmp() {
    return filterCase_ == 1;
  }
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
   * @return The memcmp.
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp getMemcmp() {
    if (filterCase_ == 1) {
       return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_;
    }
    return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.getDefaultInstance();
  }
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmpOrBuilder getMemcmpOrBuilder() {
    if (filterCase_ == 1) {
       return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_;
    }
    return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.getDefaultInstance();
  }

  public static final int DATASIZE_FIELD_NUMBER = 2;
  /**
   * <code>uint64 datasize = 2;</code>
   * @return Whether the datasize field is set.
   */
  @java.lang.Override
  public boolean hasDatasize() {
    return filterCase_ == 2;
  }
  /**
   * <code>uint64 datasize = 2;</code>
   * @return The datasize.
   */
  @java.lang.Override
  public long getDatasize() {
    if (filterCase_ == 2) {
      return (java.lang.Long) filter_;
    }
    return 0L;
  }

  public static final int TOKEN_ACCOUNT_STATE_FIELD_NUMBER = 3;
  /**
   * <code>bool token_account_state = 3;</code>
   * @return Whether the tokenAccountState field is set.
   */
  @java.lang.Override
  public boolean hasTokenAccountState() {
    return filterCase_ == 3;
  }
  /**
   * <code>bool token_account_state = 3;</code>
   * @return The tokenAccountState.
   */
  @java.lang.Override
  public boolean getTokenAccountState() {
    if (filterCase_ == 3) {
      return (java.lang.Boolean) filter_;
    }
    return false;
  }

  public static final int LAMPORTS_FIELD_NUMBER = 4;
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
   * @return Whether the lamports field is set.
   */
  @java.lang.Override
  public boolean hasLamports() {
    return filterCase_ == 4;
  }
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
   * @return The lamports.
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports getLamports() {
    if (filterCase_ == 4) {
       return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_;
    }
    return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.getDefaultInstance();
  }
  /**
   * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamportsOrBuilder getLamportsOrBuilder() {
    if (filterCase_ == 4) {
       return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_;
    }
    return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.getDefaultInstance();
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
    if (filterCase_ == 1) {
      output.writeMessage(1, (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_);
    }
    if (filterCase_ == 2) {
      output.writeUInt64(
          2, (long)((java.lang.Long) filter_));
    }
    if (filterCase_ == 3) {
      output.writeBool(
          3, (boolean)((java.lang.Boolean) filter_));
    }
    if (filterCase_ == 4) {
      output.writeMessage(4, (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filterCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_);
    }
    if (filterCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(
            2, (long)((java.lang.Long) filter_));
    }
    if (filterCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            3, (boolean)((java.lang.Boolean) filter_));
    }
    if (filterCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_);
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
    if (!(obj instanceof software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter other = (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter) obj;

    if (!getFilterCase().equals(other.getFilterCase())) return false;
    switch (filterCase_) {
      case 1:
        if (!getMemcmp()
            .equals(other.getMemcmp())) return false;
        break;
      case 2:
        if (getDatasize()
            != other.getDatasize()) return false;
        break;
      case 3:
        if (getTokenAccountState()
            != other.getTokenAccountState()) return false;
        break;
      case 4:
        if (!getLamports()
            .equals(other.getLamports())) return false;
        break;
      case 0:
      default:
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
    switch (filterCase_) {
      case 1:
        hash = (37 * hash) + MEMCMP_FIELD_NUMBER;
        hash = (53 * hash) + getMemcmp().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DATASIZE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getDatasize());
        break;
      case 3:
        hash = (37 * hash) + TOKEN_ACCOUNT_STATE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getTokenAccountState());
        break;
      case 4:
        hash = (37 * hash) + LAMPORTS_FIELD_NUMBER;
        hash = (53 * hash) + getLamports().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter parseFrom(
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
  public static Builder newBuilder(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter prototype) {
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
   * Protobuf type {@code geyser.SubscribeRequestFilterAccountsFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.SubscribeRequestFilterAccountsFilter)
      software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeRequestFilterAccountsFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeRequestFilterAccountsFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.class, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.newBuilder()
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
      if (memcmpBuilder_ != null) {
        memcmpBuilder_.clear();
      }
      if (lamportsBuilder_ != null) {
        lamportsBuilder_.clear();
      }
      filterCase_ = 0;
      filter_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeRequestFilterAccountsFilter_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter build() {
      software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter buildPartial() {
      software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter result = new software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter result) {
      result.filterCase_ = filterCase_;
      result.filter_ = this.filter_;
      if (filterCase_ == 1 &&
          memcmpBuilder_ != null) {
        result.filter_ = memcmpBuilder_.build();
      }
      if (filterCase_ == 4 &&
          lamportsBuilder_ != null) {
        result.filter_ = lamportsBuilder_.build();
      }
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
      if (other instanceof software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter) {
        return mergeFrom((software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter other) {
      if (other == software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter.getDefaultInstance()) return this;
      switch (other.getFilterCase()) {
        case MEMCMP: {
          mergeMemcmp(other.getMemcmp());
          break;
        }
        case DATASIZE: {
          setDatasize(other.getDatasize());
          break;
        }
        case TOKEN_ACCOUNT_STATE: {
          setTokenAccountState(other.getTokenAccountState());
          break;
        }
        case LAMPORTS: {
          mergeLamports(other.getLamports());
          break;
        }
        case FILTER_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getMemcmpFieldBuilder().getBuilder(),
                  extensionRegistry);
              filterCase_ = 1;
              break;
            } // case 10
            case 16: {
              filter_ = input.readUInt64();
              filterCase_ = 2;
              break;
            } // case 16
            case 24: {
              filter_ = input.readBool();
              filterCase_ = 3;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getLamportsFieldBuilder().getBuilder(),
                  extensionRegistry);
              filterCase_ = 4;
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
    private int filterCase_ = 0;
    private java.lang.Object filter_;
    public FilterCase
        getFilterCase() {
      return FilterCase.forNumber(
          filterCase_);
    }

    public Builder clearFilter() {
      filterCase_ = 0;
      filter_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.Builder, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmpOrBuilder> memcmpBuilder_;
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     * @return Whether the memcmp field is set.
     */
    @java.lang.Override
    public boolean hasMemcmp() {
      return filterCase_ == 1;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     * @return The memcmp.
     */
    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp getMemcmp() {
      if (memcmpBuilder_ == null) {
        if (filterCase_ == 1) {
          return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_;
        }
        return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.getDefaultInstance();
      } else {
        if (filterCase_ == 1) {
          return memcmpBuilder_.getMessage();
        }
        return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.getDefaultInstance();
      }
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     */
    public Builder setMemcmp(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp value) {
      if (memcmpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        memcmpBuilder_.setMessage(value);
      }
      filterCase_ = 1;
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     */
    public Builder setMemcmp(
        software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.Builder builderForValue) {
      if (memcmpBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        memcmpBuilder_.setMessage(builderForValue.build());
      }
      filterCase_ = 1;
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     */
    public Builder mergeMemcmp(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp value) {
      if (memcmpBuilder_ == null) {
        if (filterCase_ == 1 &&
            filter_ != software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.getDefaultInstance()) {
          filter_ = software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.newBuilder((software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_)
              .mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        if (filterCase_ == 1) {
          memcmpBuilder_.mergeFrom(value);
        } else {
          memcmpBuilder_.setMessage(value);
        }
      }
      filterCase_ = 1;
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     */
    public Builder clearMemcmp() {
      if (memcmpBuilder_ == null) {
        if (filterCase_ == 1) {
          filterCase_ = 0;
          filter_ = null;
          onChanged();
        }
      } else {
        if (filterCase_ == 1) {
          filterCase_ = 0;
          filter_ = null;
        }
        memcmpBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     */
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.Builder getMemcmpBuilder() {
      return getMemcmpFieldBuilder().getBuilder();
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     */
    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmpOrBuilder getMemcmpOrBuilder() {
      if ((filterCase_ == 1) && (memcmpBuilder_ != null)) {
        return memcmpBuilder_.getMessageOrBuilder();
      } else {
        if (filterCase_ == 1) {
          return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_;
        }
        return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.getDefaultInstance();
      }
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterMemcmp memcmp = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.Builder, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmpOrBuilder> 
        getMemcmpFieldBuilder() {
      if (memcmpBuilder_ == null) {
        if (!(filterCase_ == 1)) {
          filter_ = software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.getDefaultInstance();
        }
        memcmpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp.Builder, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmpOrBuilder>(
                (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterMemcmp) filter_,
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      filterCase_ = 1;
      onChanged();
      return memcmpBuilder_;
    }

    /**
     * <code>uint64 datasize = 2;</code>
     * @return Whether the datasize field is set.
     */
    public boolean hasDatasize() {
      return filterCase_ == 2;
    }
    /**
     * <code>uint64 datasize = 2;</code>
     * @return The datasize.
     */
    public long getDatasize() {
      if (filterCase_ == 2) {
        return (java.lang.Long) filter_;
      }
      return 0L;
    }
    /**
     * <code>uint64 datasize = 2;</code>
     * @param value The datasize to set.
     * @return This builder for chaining.
     */
    public Builder setDatasize(long value) {

      filterCase_ = 2;
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 datasize = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDatasize() {
      if (filterCase_ == 2) {
        filterCase_ = 0;
        filter_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>bool token_account_state = 3;</code>
     * @return Whether the tokenAccountState field is set.
     */
    public boolean hasTokenAccountState() {
      return filterCase_ == 3;
    }
    /**
     * <code>bool token_account_state = 3;</code>
     * @return The tokenAccountState.
     */
    public boolean getTokenAccountState() {
      if (filterCase_ == 3) {
        return (java.lang.Boolean) filter_;
      }
      return false;
    }
    /**
     * <code>bool token_account_state = 3;</code>
     * @param value The tokenAccountState to set.
     * @return This builder for chaining.
     */
    public Builder setTokenAccountState(boolean value) {

      filterCase_ = 3;
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool token_account_state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenAccountState() {
      if (filterCase_ == 3) {
        filterCase_ = 0;
        filter_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.Builder, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamportsOrBuilder> lamportsBuilder_;
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     * @return Whether the lamports field is set.
     */
    @java.lang.Override
    public boolean hasLamports() {
      return filterCase_ == 4;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     * @return The lamports.
     */
    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports getLamports() {
      if (lamportsBuilder_ == null) {
        if (filterCase_ == 4) {
          return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_;
        }
        return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.getDefaultInstance();
      } else {
        if (filterCase_ == 4) {
          return lamportsBuilder_.getMessage();
        }
        return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.getDefaultInstance();
      }
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     */
    public Builder setLamports(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports value) {
      if (lamportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        lamportsBuilder_.setMessage(value);
      }
      filterCase_ = 4;
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     */
    public Builder setLamports(
        software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.Builder builderForValue) {
      if (lamportsBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        lamportsBuilder_.setMessage(builderForValue.build());
      }
      filterCase_ = 4;
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     */
    public Builder mergeLamports(software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports value) {
      if (lamportsBuilder_ == null) {
        if (filterCase_ == 4 &&
            filter_ != software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.getDefaultInstance()) {
          filter_ = software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.newBuilder((software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_)
              .mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        if (filterCase_ == 4) {
          lamportsBuilder_.mergeFrom(value);
        } else {
          lamportsBuilder_.setMessage(value);
        }
      }
      filterCase_ = 4;
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     */
    public Builder clearLamports() {
      if (lamportsBuilder_ == null) {
        if (filterCase_ == 4) {
          filterCase_ = 0;
          filter_ = null;
          onChanged();
        }
      } else {
        if (filterCase_ == 4) {
          filterCase_ = 0;
          filter_ = null;
        }
        lamportsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     */
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.Builder getLamportsBuilder() {
      return getLamportsFieldBuilder().getBuilder();
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     */
    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamportsOrBuilder getLamportsOrBuilder() {
      if ((filterCase_ == 4) && (lamportsBuilder_ != null)) {
        return lamportsBuilder_.getMessageOrBuilder();
      } else {
        if (filterCase_ == 4) {
          return (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_;
        }
        return software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.getDefaultInstance();
      }
    }
    /**
     * <code>.geyser.SubscribeRequestFilterAccountsFilterLamports lamports = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.Builder, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamportsOrBuilder> 
        getLamportsFieldBuilder() {
      if (lamportsBuilder_ == null) {
        if (!(filterCase_ == 4)) {
          filter_ = software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.getDefaultInstance();
        }
        lamportsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports.Builder, software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamportsOrBuilder>(
                (software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilterLamports) filter_,
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      filterCase_ = 4;
      onChanged();
      return lamportsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:geyser.SubscribeRequestFilterAccountsFilter)
  }

  // @@protoc_insertion_point(class_scope:geyser.SubscribeRequestFilterAccountsFilter)
  private static final software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter();
  }

  public static software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeRequestFilterAccountsFilter>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeRequestFilterAccountsFilter>() {
    @java.lang.Override
    public SubscribeRequestFilterAccountsFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeRequestFilterAccountsFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeRequestFilterAccountsFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeRequestFilterAccountsFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

