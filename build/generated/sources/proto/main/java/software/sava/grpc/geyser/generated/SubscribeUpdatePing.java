// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code geyser.SubscribeUpdatePing}
 */
@com.google.protobuf.Generated
public final class SubscribeUpdatePing extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:geyser.SubscribeUpdatePing)
    SubscribeUpdatePingOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      SubscribeUpdatePing.class.getName());
  }
  // Use SubscribeUpdatePing.newBuilder() to construct.
  private SubscribeUpdatePing(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SubscribeUpdatePing() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdatePing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdatePing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.SubscribeUpdatePing.class, software.sava.grpc.geyser.generated.SubscribeUpdatePing.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof software.sava.grpc.geyser.generated.SubscribeUpdatePing)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.SubscribeUpdatePing other = (software.sava.grpc.geyser.generated.SubscribeUpdatePing) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing parseFrom(
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
  public static Builder newBuilder(software.sava.grpc.geyser.generated.SubscribeUpdatePing prototype) {
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
   * Protobuf type {@code geyser.SubscribeUpdatePing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.SubscribeUpdatePing)
      software.sava.grpc.geyser.generated.SubscribeUpdatePingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdatePing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdatePing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.SubscribeUpdatePing.class, software.sava.grpc.geyser.generated.SubscribeUpdatePing.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.SubscribeUpdatePing.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_SubscribeUpdatePing_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdatePing getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.SubscribeUpdatePing.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdatePing build() {
      software.sava.grpc.geyser.generated.SubscribeUpdatePing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.SubscribeUpdatePing buildPartial() {
      software.sava.grpc.geyser.generated.SubscribeUpdatePing result = new software.sava.grpc.geyser.generated.SubscribeUpdatePing(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof software.sava.grpc.geyser.generated.SubscribeUpdatePing) {
        return mergeFrom((software.sava.grpc.geyser.generated.SubscribeUpdatePing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.SubscribeUpdatePing other) {
      if (other == software.sava.grpc.geyser.generated.SubscribeUpdatePing.getDefaultInstance()) return this;
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

    // @@protoc_insertion_point(builder_scope:geyser.SubscribeUpdatePing)
  }

  // @@protoc_insertion_point(class_scope:geyser.SubscribeUpdatePing)
  private static final software.sava.grpc.geyser.generated.SubscribeUpdatePing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.SubscribeUpdatePing();
  }

  public static software.sava.grpc.geyser.generated.SubscribeUpdatePing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeUpdatePing>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeUpdatePing>() {
    @java.lang.Override
    public SubscribeUpdatePing parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeUpdatePing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeUpdatePing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.SubscribeUpdatePing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

