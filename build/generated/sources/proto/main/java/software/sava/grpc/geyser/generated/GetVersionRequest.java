// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: geyser.proto
// Protobuf Java Version: 4.31.1

package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code geyser.GetVersionRequest}
 */
@com.google.protobuf.Generated
public final class GetVersionRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:geyser.GetVersionRequest)
    GetVersionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      GetVersionRequest.class.getName());
  }
  // Use GetVersionRequest.newBuilder() to construct.
  private GetVersionRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetVersionRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_GetVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_GetVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.GetVersionRequest.class, software.sava.grpc.geyser.generated.GetVersionRequest.Builder.class);
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
    if (!(obj instanceof software.sava.grpc.geyser.generated.GetVersionRequest)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.GetVersionRequest other = (software.sava.grpc.geyser.generated.GetVersionRequest) obj;

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

  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.GetVersionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.GetVersionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.GetVersionRequest parseFrom(
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
  public static Builder newBuilder(software.sava.grpc.geyser.generated.GetVersionRequest prototype) {
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
   * Protobuf type {@code geyser.GetVersionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:geyser.GetVersionRequest)
      software.sava.grpc.geyser.generated.GetVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_GetVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_GetVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.GetVersionRequest.class, software.sava.grpc.geyser.generated.GetVersionRequest.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.GetVersionRequest.newBuilder()
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
      return software.sava.grpc.geyser.generated.GeyserOuterClass.internal_static_geyser_GetVersionRequest_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.GetVersionRequest getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.GetVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.GetVersionRequest build() {
      software.sava.grpc.geyser.generated.GetVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.GetVersionRequest buildPartial() {
      software.sava.grpc.geyser.generated.GetVersionRequest result = new software.sava.grpc.geyser.generated.GetVersionRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof software.sava.grpc.geyser.generated.GetVersionRequest) {
        return mergeFrom((software.sava.grpc.geyser.generated.GetVersionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.GetVersionRequest other) {
      if (other == software.sava.grpc.geyser.generated.GetVersionRequest.getDefaultInstance()) return this;
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

    // @@protoc_insertion_point(builder_scope:geyser.GetVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:geyser.GetVersionRequest)
  private static final software.sava.grpc.geyser.generated.GetVersionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.GetVersionRequest();
  }

  public static software.sava.grpc.geyser.generated.GetVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetVersionRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetVersionRequest>() {
    @java.lang.Override
    public GetVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.GetVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

