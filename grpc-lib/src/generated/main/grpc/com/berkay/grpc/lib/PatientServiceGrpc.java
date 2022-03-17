package com.berkay.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: patient.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PatientServiceGrpc {

  private PatientServiceGrpc() {}

  public static final String SERVICE_NAME = "PatientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientCreateRequest,
      com.berkay.grpc.lib.PatientReply> getCreatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatient",
      requestType = com.berkay.grpc.lib.PatientCreateRequest.class,
      responseType = com.berkay.grpc.lib.PatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientCreateRequest,
      com.berkay.grpc.lib.PatientReply> getCreatePatientMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientCreateRequest, com.berkay.grpc.lib.PatientReply> getCreatePatientMethod;
    if ((getCreatePatientMethod = PatientServiceGrpc.getCreatePatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getCreatePatientMethod = PatientServiceGrpc.getCreatePatientMethod) == null) {
          PatientServiceGrpc.getCreatePatientMethod = getCreatePatientMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.PatientCreateRequest, com.berkay.grpc.lib.PatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("CreatePatient"))
              .build();
        }
      }
    }
    return getCreatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest,
      com.berkay.grpc.lib.PatientReply> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatient",
      requestType = com.berkay.grpc.lib.PatientRequest.class,
      responseType = com.berkay.grpc.lib.PatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest,
      com.berkay.grpc.lib.PatientReply> getGetPatientMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest, com.berkay.grpc.lib.PatientReply> getGetPatientMethod;
    if ((getGetPatientMethod = PatientServiceGrpc.getGetPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetPatientMethod = PatientServiceGrpc.getGetPatientMethod) == null) {
          PatientServiceGrpc.getGetPatientMethod = getGetPatientMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.PatientRequest, com.berkay.grpc.lib.PatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("GetPatient"))
              .build();
        }
      }
    }
    return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientEmptyRequest,
      com.berkay.grpc.lib.PatientReply> getGetAllPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPatient",
      requestType = com.berkay.grpc.lib.PatientEmptyRequest.class,
      responseType = com.berkay.grpc.lib.PatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientEmptyRequest,
      com.berkay.grpc.lib.PatientReply> getGetAllPatientMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientEmptyRequest, com.berkay.grpc.lib.PatientReply> getGetAllPatientMethod;
    if ((getGetAllPatientMethod = PatientServiceGrpc.getGetAllPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetAllPatientMethod = PatientServiceGrpc.getGetAllPatientMethod) == null) {
          PatientServiceGrpc.getGetAllPatientMethod = getGetAllPatientMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.PatientEmptyRequest, com.berkay.grpc.lib.PatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientEmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("GetAllPatient"))
              .build();
        }
      }
    }
    return getGetAllPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientModifyRequest,
      com.berkay.grpc.lib.PatientReply> getModifyPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyPatient",
      requestType = com.berkay.grpc.lib.PatientModifyRequest.class,
      responseType = com.berkay.grpc.lib.PatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientModifyRequest,
      com.berkay.grpc.lib.PatientReply> getModifyPatientMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientModifyRequest, com.berkay.grpc.lib.PatientReply> getModifyPatientMethod;
    if ((getModifyPatientMethod = PatientServiceGrpc.getModifyPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getModifyPatientMethod = PatientServiceGrpc.getModifyPatientMethod) == null) {
          PatientServiceGrpc.getModifyPatientMethod = getModifyPatientMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.PatientModifyRequest, com.berkay.grpc.lib.PatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientModifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("ModifyPatient"))
              .build();
        }
      }
    }
    return getModifyPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest,
      com.berkay.grpc.lib.PatientReply> getDeletePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePatient",
      requestType = com.berkay.grpc.lib.PatientRequest.class,
      responseType = com.berkay.grpc.lib.PatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest,
      com.berkay.grpc.lib.PatientReply> getDeletePatientMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest, com.berkay.grpc.lib.PatientReply> getDeletePatientMethod;
    if ((getDeletePatientMethod = PatientServiceGrpc.getDeletePatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getDeletePatientMethod = PatientServiceGrpc.getDeletePatientMethod) == null) {
          PatientServiceGrpc.getDeletePatientMethod = getDeletePatientMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.PatientRequest, com.berkay.grpc.lib.PatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("DeletePatient"))
              .build();
        }
      }
    }
    return getDeletePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientEmptyRequest,
      com.berkay.grpc.lib.PatientReply> getDeleteAllPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllPatient",
      requestType = com.berkay.grpc.lib.PatientEmptyRequest.class,
      responseType = com.berkay.grpc.lib.PatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientEmptyRequest,
      com.berkay.grpc.lib.PatientReply> getDeleteAllPatientMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientEmptyRequest, com.berkay.grpc.lib.PatientReply> getDeleteAllPatientMethod;
    if ((getDeleteAllPatientMethod = PatientServiceGrpc.getDeleteAllPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getDeleteAllPatientMethod = PatientServiceGrpc.getDeleteAllPatientMethod) == null) {
          PatientServiceGrpc.getDeleteAllPatientMethod = getDeleteAllPatientMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.PatientEmptyRequest, com.berkay.grpc.lib.PatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientEmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("DeleteAllPatient"))
              .build();
        }
      }
    }
    return getDeleteAllPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest,
      com.berkay.grpc.lib.PatientReply> getGetAllHospitalsOfPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllHospitalsOfPatient",
      requestType = com.berkay.grpc.lib.PatientRequest.class,
      responseType = com.berkay.grpc.lib.PatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest,
      com.berkay.grpc.lib.PatientReply> getGetAllHospitalsOfPatientMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.PatientRequest, com.berkay.grpc.lib.PatientReply> getGetAllHospitalsOfPatientMethod;
    if ((getGetAllHospitalsOfPatientMethod = PatientServiceGrpc.getGetAllHospitalsOfPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetAllHospitalsOfPatientMethod = PatientServiceGrpc.getGetAllHospitalsOfPatientMethod) == null) {
          PatientServiceGrpc.getGetAllHospitalsOfPatientMethod = getGetAllHospitalsOfPatientMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.PatientRequest, com.berkay.grpc.lib.PatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllHospitalsOfPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.PatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("GetAllHospitalsOfPatient"))
              .build();
        }
      }
    }
    return getGetAllHospitalsOfPatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceStub>() {
        @java.lang.Override
        public PatientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceStub(channel, callOptions);
        }
      };
    return PatientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceBlockingStub>() {
        @java.lang.Override
        public PatientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceBlockingStub(channel, callOptions);
        }
      };
    return PatientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceFutureStub>() {
        @java.lang.Override
        public PatientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceFutureStub(channel, callOptions);
        }
      };
    return PatientServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PatientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPatient(com.berkay.grpc.lib.PatientCreateRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePatientMethod(), responseObserver);
    }

    /**
     */
    public void getPatient(com.berkay.grpc.lib.PatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     */
    public void getAllPatient(com.berkay.grpc.lib.PatientEmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPatientMethod(), responseObserver);
    }

    /**
     */
    public void modifyPatient(com.berkay.grpc.lib.PatientModifyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyPatientMethod(), responseObserver);
    }

    /**
     */
    public void deletePatient(com.berkay.grpc.lib.PatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePatientMethod(), responseObserver);
    }

    /**
     */
    public void deleteAllPatient(com.berkay.grpc.lib.PatientEmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllPatientMethod(), responseObserver);
    }

    /**
     */
    public void getAllHospitalsOfPatient(com.berkay.grpc.lib.PatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllHospitalsOfPatientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.PatientCreateRequest,
                com.berkay.grpc.lib.PatientReply>(
                  this, METHODID_CREATE_PATIENT)))
          .addMethod(
            getGetPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.PatientRequest,
                com.berkay.grpc.lib.PatientReply>(
                  this, METHODID_GET_PATIENT)))
          .addMethod(
            getGetAllPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.PatientEmptyRequest,
                com.berkay.grpc.lib.PatientReply>(
                  this, METHODID_GET_ALL_PATIENT)))
          .addMethod(
            getModifyPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.PatientModifyRequest,
                com.berkay.grpc.lib.PatientReply>(
                  this, METHODID_MODIFY_PATIENT)))
          .addMethod(
            getDeletePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.PatientRequest,
                com.berkay.grpc.lib.PatientReply>(
                  this, METHODID_DELETE_PATIENT)))
          .addMethod(
            getDeleteAllPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.PatientEmptyRequest,
                com.berkay.grpc.lib.PatientReply>(
                  this, METHODID_DELETE_ALL_PATIENT)))
          .addMethod(
            getGetAllHospitalsOfPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.PatientRequest,
                com.berkay.grpc.lib.PatientReply>(
                  this, METHODID_GET_ALL_HOSPITALS_OF_PATIENT)))
          .build();
    }
  }

  /**
   */
  public static final class PatientServiceStub extends io.grpc.stub.AbstractAsyncStub<PatientServiceStub> {
    private PatientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPatient(com.berkay.grpc.lib.PatientCreateRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatient(com.berkay.grpc.lib.PatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllPatient(com.berkay.grpc.lib.PatientEmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyPatient(com.berkay.grpc.lib.PatientModifyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePatient(com.berkay.grpc.lib.PatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAllPatient(com.berkay.grpc.lib.PatientEmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllHospitalsOfPatient(com.berkay.grpc.lib.PatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllHospitalsOfPatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PatientServiceBlockingStub> {
    private PatientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.berkay.grpc.lib.PatientReply createPatient(com.berkay.grpc.lib.PatientCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.PatientReply getPatient(com.berkay.grpc.lib.PatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.PatientReply getAllPatient(com.berkay.grpc.lib.PatientEmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.PatientReply modifyPatient(com.berkay.grpc.lib.PatientModifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.PatientReply deletePatient(com.berkay.grpc.lib.PatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.PatientReply deleteAllPatient(com.berkay.grpc.lib.PatientEmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.PatientReply getAllHospitalsOfPatient(com.berkay.grpc.lib.PatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllHospitalsOfPatientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PatientServiceFutureStub> {
    private PatientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.PatientReply> createPatient(
        com.berkay.grpc.lib.PatientCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.PatientReply> getPatient(
        com.berkay.grpc.lib.PatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.PatientReply> getAllPatient(
        com.berkay.grpc.lib.PatientEmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.PatientReply> modifyPatient(
        com.berkay.grpc.lib.PatientModifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.PatientReply> deletePatient(
        com.berkay.grpc.lib.PatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.PatientReply> deleteAllPatient(
        com.berkay.grpc.lib.PatientEmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.PatientReply> getAllHospitalsOfPatient(
        com.berkay.grpc.lib.PatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllHospitalsOfPatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PATIENT = 0;
  private static final int METHODID_GET_PATIENT = 1;
  private static final int METHODID_GET_ALL_PATIENT = 2;
  private static final int METHODID_MODIFY_PATIENT = 3;
  private static final int METHODID_DELETE_PATIENT = 4;
  private static final int METHODID_DELETE_ALL_PATIENT = 5;
  private static final int METHODID_GET_ALL_HOSPITALS_OF_PATIENT = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((com.berkay.grpc.lib.PatientCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply>) responseObserver);
          break;
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((com.berkay.grpc.lib.PatientRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply>) responseObserver);
          break;
        case METHODID_GET_ALL_PATIENT:
          serviceImpl.getAllPatient((com.berkay.grpc.lib.PatientEmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply>) responseObserver);
          break;
        case METHODID_MODIFY_PATIENT:
          serviceImpl.modifyPatient((com.berkay.grpc.lib.PatientModifyRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply>) responseObserver);
          break;
        case METHODID_DELETE_PATIENT:
          serviceImpl.deletePatient((com.berkay.grpc.lib.PatientRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply>) responseObserver);
          break;
        case METHODID_DELETE_ALL_PATIENT:
          serviceImpl.deleteAllPatient((com.berkay.grpc.lib.PatientEmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply>) responseObserver);
          break;
        case METHODID_GET_ALL_HOSPITALS_OF_PATIENT:
          serviceImpl.getAllHospitalsOfPatient((com.berkay.grpc.lib.PatientRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.PatientReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.berkay.grpc.lib.PatientProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientService");
    }
  }

  private static final class PatientServiceFileDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier {
    PatientServiceFileDescriptorSupplier() {}
  }

  private static final class PatientServiceMethodDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientServiceFileDescriptorSupplier())
              .addMethod(getCreatePatientMethod())
              .addMethod(getGetPatientMethod())
              .addMethod(getGetAllPatientMethod())
              .addMethod(getModifyPatientMethod())
              .addMethod(getDeletePatientMethod())
              .addMethod(getDeleteAllPatientMethod())
              .addMethod(getGetAllHospitalsOfPatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
