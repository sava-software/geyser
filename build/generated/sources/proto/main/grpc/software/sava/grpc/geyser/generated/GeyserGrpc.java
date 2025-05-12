package software.sava.grpc.geyser.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class GeyserGrpc {

  private GeyserGrpc() {}

  public static final java.lang.String SERVICE_NAME = "geyser.Geyser";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.SubscribeRequest,
      software.sava.grpc.geyser.generated.SubscribeUpdate> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = software.sava.grpc.geyser.generated.SubscribeRequest.class,
      responseType = software.sava.grpc.geyser.generated.SubscribeUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.SubscribeRequest,
      software.sava.grpc.geyser.generated.SubscribeUpdate> getSubscribeMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.SubscribeRequest, software.sava.grpc.geyser.generated.SubscribeUpdate> getSubscribeMethod;
    if ((getSubscribeMethod = GeyserGrpc.getSubscribeMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getSubscribeMethod = GeyserGrpc.getSubscribeMethod) == null) {
          GeyserGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.SubscribeRequest, software.sava.grpc.geyser.generated.SubscribeUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.SubscribeUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest,
      software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse> getSubscribeReplayInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeReplayInfo",
      requestType = software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest.class,
      responseType = software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest,
      software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse> getSubscribeReplayInfoMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest, software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse> getSubscribeReplayInfoMethod;
    if ((getSubscribeReplayInfoMethod = GeyserGrpc.getSubscribeReplayInfoMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getSubscribeReplayInfoMethod = GeyserGrpc.getSubscribeReplayInfoMethod) == null) {
          GeyserGrpc.getSubscribeReplayInfoMethod = getSubscribeReplayInfoMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest, software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeReplayInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("SubscribeReplayInfo"))
              .build();
        }
      }
    }
    return getSubscribeReplayInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.PingRequest,
      software.sava.grpc.geyser.generated.PongResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = software.sava.grpc.geyser.generated.PingRequest.class,
      responseType = software.sava.grpc.geyser.generated.PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.PingRequest,
      software.sava.grpc.geyser.generated.PongResponse> getPingMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.PingRequest, software.sava.grpc.geyser.generated.PongResponse> getPingMethod;
    if ((getPingMethod = GeyserGrpc.getPingMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getPingMethod = GeyserGrpc.getPingMethod) == null) {
          GeyserGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.PingRequest, software.sava.grpc.geyser.generated.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetLatestBlockhashRequest,
      software.sava.grpc.geyser.generated.GetLatestBlockhashResponse> getGetLatestBlockhashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestBlockhash",
      requestType = software.sava.grpc.geyser.generated.GetLatestBlockhashRequest.class,
      responseType = software.sava.grpc.geyser.generated.GetLatestBlockhashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetLatestBlockhashRequest,
      software.sava.grpc.geyser.generated.GetLatestBlockhashResponse> getGetLatestBlockhashMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetLatestBlockhashRequest, software.sava.grpc.geyser.generated.GetLatestBlockhashResponse> getGetLatestBlockhashMethod;
    if ((getGetLatestBlockhashMethod = GeyserGrpc.getGetLatestBlockhashMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetLatestBlockhashMethod = GeyserGrpc.getGetLatestBlockhashMethod) == null) {
          GeyserGrpc.getGetLatestBlockhashMethod = getGetLatestBlockhashMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.GetLatestBlockhashRequest, software.sava.grpc.geyser.generated.GetLatestBlockhashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestBlockhash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetLatestBlockhashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetLatestBlockhashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetLatestBlockhash"))
              .build();
        }
      }
    }
    return getGetLatestBlockhashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetBlockHeightRequest,
      software.sava.grpc.geyser.generated.GetBlockHeightResponse> getGetBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockHeight",
      requestType = software.sava.grpc.geyser.generated.GetBlockHeightRequest.class,
      responseType = software.sava.grpc.geyser.generated.GetBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetBlockHeightRequest,
      software.sava.grpc.geyser.generated.GetBlockHeightResponse> getGetBlockHeightMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetBlockHeightRequest, software.sava.grpc.geyser.generated.GetBlockHeightResponse> getGetBlockHeightMethod;
    if ((getGetBlockHeightMethod = GeyserGrpc.getGetBlockHeightMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetBlockHeightMethod = GeyserGrpc.getGetBlockHeightMethod) == null) {
          GeyserGrpc.getGetBlockHeightMethod = getGetBlockHeightMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.GetBlockHeightRequest, software.sava.grpc.geyser.generated.GetBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetBlockHeight"))
              .build();
        }
      }
    }
    return getGetBlockHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetSlotRequest,
      software.sava.grpc.geyser.generated.GetSlotResponse> getGetSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSlot",
      requestType = software.sava.grpc.geyser.generated.GetSlotRequest.class,
      responseType = software.sava.grpc.geyser.generated.GetSlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetSlotRequest,
      software.sava.grpc.geyser.generated.GetSlotResponse> getGetSlotMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetSlotRequest, software.sava.grpc.geyser.generated.GetSlotResponse> getGetSlotMethod;
    if ((getGetSlotMethod = GeyserGrpc.getGetSlotMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetSlotMethod = GeyserGrpc.getGetSlotMethod) == null) {
          GeyserGrpc.getGetSlotMethod = getGetSlotMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.GetSlotRequest, software.sava.grpc.geyser.generated.GetSlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetSlotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetSlotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetSlot"))
              .build();
        }
      }
    }
    return getGetSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.IsBlockhashValidRequest,
      software.sava.grpc.geyser.generated.IsBlockhashValidResponse> getIsBlockhashValidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsBlockhashValid",
      requestType = software.sava.grpc.geyser.generated.IsBlockhashValidRequest.class,
      responseType = software.sava.grpc.geyser.generated.IsBlockhashValidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.IsBlockhashValidRequest,
      software.sava.grpc.geyser.generated.IsBlockhashValidResponse> getIsBlockhashValidMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.IsBlockhashValidRequest, software.sava.grpc.geyser.generated.IsBlockhashValidResponse> getIsBlockhashValidMethod;
    if ((getIsBlockhashValidMethod = GeyserGrpc.getIsBlockhashValidMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getIsBlockhashValidMethod = GeyserGrpc.getIsBlockhashValidMethod) == null) {
          GeyserGrpc.getIsBlockhashValidMethod = getIsBlockhashValidMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.IsBlockhashValidRequest, software.sava.grpc.geyser.generated.IsBlockhashValidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsBlockhashValid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.IsBlockhashValidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.IsBlockhashValidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("IsBlockhashValid"))
              .build();
        }
      }
    }
    return getIsBlockhashValidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetVersionRequest,
      software.sava.grpc.geyser.generated.GetVersionResponse> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = software.sava.grpc.geyser.generated.GetVersionRequest.class,
      responseType = software.sava.grpc.geyser.generated.GetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetVersionRequest,
      software.sava.grpc.geyser.generated.GetVersionResponse> getGetVersionMethod() {
    io.grpc.MethodDescriptor<software.sava.grpc.geyser.generated.GetVersionRequest, software.sava.grpc.geyser.generated.GetVersionResponse> getGetVersionMethod;
    if ((getGetVersionMethod = GeyserGrpc.getGetVersionMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetVersionMethod = GeyserGrpc.getGetVersionMethod) == null) {
          GeyserGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<software.sava.grpc.geyser.generated.GetVersionRequest, software.sava.grpc.geyser.generated.GetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  software.sava.grpc.geyser.generated.GetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetVersion"))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeyserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeyserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeyserStub>() {
        @java.lang.Override
        public GeyserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeyserStub(channel, callOptions);
        }
      };
    return GeyserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static GeyserBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeyserBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeyserBlockingV2Stub>() {
        @java.lang.Override
        public GeyserBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeyserBlockingV2Stub(channel, callOptions);
        }
      };
    return GeyserBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeyserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeyserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeyserBlockingStub>() {
        @java.lang.Override
        public GeyserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeyserBlockingStub(channel, callOptions);
        }
      };
    return GeyserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeyserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeyserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeyserFutureStub>() {
        @java.lang.Override
        public GeyserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeyserFutureStub(channel, callOptions);
        }
      };
    return GeyserFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeUpdate> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscribeMethod(), responseObserver);
    }

    /**
     */
    default void subscribeReplayInfo(software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeReplayInfoMethod(), responseObserver);
    }

    /**
     */
    default void ping(software.sava.grpc.geyser.generated.PingRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.PongResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    default void getLatestBlockhash(software.sava.grpc.geyser.generated.GetLatestBlockhashRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetLatestBlockhashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestBlockhashMethod(), responseObserver);
    }

    /**
     */
    default void getBlockHeight(software.sava.grpc.geyser.generated.GetBlockHeightRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetBlockHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockHeightMethod(), responseObserver);
    }

    /**
     */
    default void getSlot(software.sava.grpc.geyser.generated.GetSlotRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetSlotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSlotMethod(), responseObserver);
    }

    /**
     */
    default void isBlockhashValid(software.sava.grpc.geyser.generated.IsBlockhashValidRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.IsBlockhashValidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsBlockhashValidMethod(), responseObserver);
    }

    /**
     */
    default void getVersion(software.sava.grpc.geyser.generated.GetVersionRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Geyser.
   */
  public static abstract class GeyserImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GeyserGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Geyser.
   */
  public static final class GeyserStub
      extends io.grpc.stub.AbstractAsyncStub<GeyserStub> {
    private GeyserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeyserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeyserStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeUpdate> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void subscribeReplayInfo(software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeReplayInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(software.sava.grpc.geyser.generated.PingRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.PongResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLatestBlockhash(software.sava.grpc.geyser.generated.GetLatestBlockhashRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetLatestBlockhashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestBlockhashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockHeight(software.sava.grpc.geyser.generated.GetBlockHeightRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetBlockHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSlot(software.sava.grpc.geyser.generated.GetSlotRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetSlotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isBlockhashValid(software.sava.grpc.geyser.generated.IsBlockhashValidRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.IsBlockhashValidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsBlockhashValidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVersion(software.sava.grpc.geyser.generated.GetVersionRequest request,
        io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Geyser.
   */
  public static final class GeyserBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<GeyserBlockingV2Stub> {
    private GeyserBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeyserBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeyserBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<software.sava.grpc.geyser.generated.SubscribeRequest, software.sava.grpc.geyser.generated.SubscribeUpdate>
        subscribe() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions());
    }

    /**
     */
    public software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse subscribeReplayInfo(software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeReplayInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.PongResponse ping(software.sava.grpc.geyser.generated.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetLatestBlockhashResponse getLatestBlockhash(software.sava.grpc.geyser.generated.GetLatestBlockhashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestBlockhashMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetBlockHeightResponse getBlockHeight(software.sava.grpc.geyser.generated.GetBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetSlotResponse getSlot(software.sava.grpc.geyser.generated.GetSlotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.IsBlockhashValidResponse isBlockhashValid(software.sava.grpc.geyser.generated.IsBlockhashValidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsBlockhashValidMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetVersionResponse getVersion(software.sava.grpc.geyser.generated.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Geyser.
   */
  public static final class GeyserBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GeyserBlockingStub> {
    private GeyserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeyserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeyserBlockingStub(channel, callOptions);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse subscribeReplayInfo(software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeReplayInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.PongResponse ping(software.sava.grpc.geyser.generated.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetLatestBlockhashResponse getLatestBlockhash(software.sava.grpc.geyser.generated.GetLatestBlockhashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestBlockhashMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetBlockHeightResponse getBlockHeight(software.sava.grpc.geyser.generated.GetBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetSlotResponse getSlot(software.sava.grpc.geyser.generated.GetSlotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.IsBlockhashValidResponse isBlockhashValid(software.sava.grpc.geyser.generated.IsBlockhashValidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsBlockhashValidMethod(), getCallOptions(), request);
    }

    /**
     */
    public software.sava.grpc.geyser.generated.GetVersionResponse getVersion(software.sava.grpc.geyser.generated.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Geyser.
   */
  public static final class GeyserFutureStub
      extends io.grpc.stub.AbstractFutureStub<GeyserFutureStub> {
    private GeyserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeyserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeyserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse> subscribeReplayInfo(
        software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeReplayInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<software.sava.grpc.geyser.generated.PongResponse> ping(
        software.sava.grpc.geyser.generated.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<software.sava.grpc.geyser.generated.GetLatestBlockhashResponse> getLatestBlockhash(
        software.sava.grpc.geyser.generated.GetLatestBlockhashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestBlockhashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<software.sava.grpc.geyser.generated.GetBlockHeightResponse> getBlockHeight(
        software.sava.grpc.geyser.generated.GetBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockHeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<software.sava.grpc.geyser.generated.GetSlotResponse> getSlot(
        software.sava.grpc.geyser.generated.GetSlotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<software.sava.grpc.geyser.generated.IsBlockhashValidResponse> isBlockhashValid(
        software.sava.grpc.geyser.generated.IsBlockhashValidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsBlockhashValidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<software.sava.grpc.geyser.generated.GetVersionResponse> getVersion(
        software.sava.grpc.geyser.generated.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_REPLAY_INFO = 0;
  private static final int METHODID_PING = 1;
  private static final int METHODID_GET_LATEST_BLOCKHASH = 2;
  private static final int METHODID_GET_BLOCK_HEIGHT = 3;
  private static final int METHODID_GET_SLOT = 4;
  private static final int METHODID_IS_BLOCKHASH_VALID = 5;
  private static final int METHODID_GET_VERSION = 6;
  private static final int METHODID_SUBSCRIBE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_REPLAY_INFO:
          serviceImpl.subscribeReplayInfo((software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest) request,
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((software.sava.grpc.geyser.generated.PingRequest) request,
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.PongResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_BLOCKHASH:
          serviceImpl.getLatestBlockhash((software.sava.grpc.geyser.generated.GetLatestBlockhashRequest) request,
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetLatestBlockhashResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEIGHT:
          serviceImpl.getBlockHeight((software.sava.grpc.geyser.generated.GetBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetBlockHeightResponse>) responseObserver);
          break;
        case METHODID_GET_SLOT:
          serviceImpl.getSlot((software.sava.grpc.geyser.generated.GetSlotRequest) request,
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetSlotResponse>) responseObserver);
          break;
        case METHODID_IS_BLOCKHASH_VALID:
          serviceImpl.isBlockhashValid((software.sava.grpc.geyser.generated.IsBlockhashValidRequest) request,
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.IsBlockhashValidResponse>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((software.sava.grpc.geyser.generated.GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.GetVersionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribe(
              (io.grpc.stub.StreamObserver<software.sava.grpc.geyser.generated.SubscribeUpdate>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.SubscribeRequest,
              software.sava.grpc.geyser.generated.SubscribeUpdate>(
                service, METHODID_SUBSCRIBE)))
        .addMethod(
          getSubscribeReplayInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.SubscribeReplayInfoRequest,
              software.sava.grpc.geyser.generated.SubscribeReplayInfoResponse>(
                service, METHODID_SUBSCRIBE_REPLAY_INFO)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.PingRequest,
              software.sava.grpc.geyser.generated.PongResponse>(
                service, METHODID_PING)))
        .addMethod(
          getGetLatestBlockhashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.GetLatestBlockhashRequest,
              software.sava.grpc.geyser.generated.GetLatestBlockhashResponse>(
                service, METHODID_GET_LATEST_BLOCKHASH)))
        .addMethod(
          getGetBlockHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.GetBlockHeightRequest,
              software.sava.grpc.geyser.generated.GetBlockHeightResponse>(
                service, METHODID_GET_BLOCK_HEIGHT)))
        .addMethod(
          getGetSlotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.GetSlotRequest,
              software.sava.grpc.geyser.generated.GetSlotResponse>(
                service, METHODID_GET_SLOT)))
        .addMethod(
          getIsBlockhashValidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.IsBlockhashValidRequest,
              software.sava.grpc.geyser.generated.IsBlockhashValidResponse>(
                service, METHODID_IS_BLOCKHASH_VALID)))
        .addMethod(
          getGetVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              software.sava.grpc.geyser.generated.GetVersionRequest,
              software.sava.grpc.geyser.generated.GetVersionResponse>(
                service, METHODID_GET_VERSION)))
        .build();
  }

  private static abstract class GeyserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeyserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return software.sava.grpc.geyser.generated.GeyserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Geyser");
    }
  }

  private static final class GeyserFileDescriptorSupplier
      extends GeyserBaseDescriptorSupplier {
    GeyserFileDescriptorSupplier() {}
  }

  private static final class GeyserMethodDescriptorSupplier
      extends GeyserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GeyserMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GeyserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeyserFileDescriptorSupplier())
              .addMethod(getSubscribeMethod())
              .addMethod(getSubscribeReplayInfoMethod())
              .addMethod(getPingMethod())
              .addMethod(getGetLatestBlockhashMethod())
              .addMethod(getGetBlockHeightMethod())
              .addMethod(getGetSlotMethod())
              .addMethod(getIsBlockhashValidMethod())
              .addMethod(getGetVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
