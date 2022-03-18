package com.berkay.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: hospital.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HospitalServiceGrpc {

  private HospitalServiceGrpc() {}

  public static final String SERVICE_NAME = "HospitalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalCreateRequest,
      com.berkay.grpc.lib.HospitalReply> getCreateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHospital",
      requestType = com.berkay.grpc.lib.HospitalCreateRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalCreateRequest,
      com.berkay.grpc.lib.HospitalReply> getCreateHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalCreateRequest, com.berkay.grpc.lib.HospitalReply> getCreateHospitalMethod;
    if ((getCreateHospitalMethod = HospitalServiceGrpc.getCreateHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getCreateHospitalMethod = HospitalServiceGrpc.getCreateHospitalMethod) == null) {
          HospitalServiceGrpc.getCreateHospitalMethod = getCreateHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.HospitalCreateRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("CreateHospital"))
              .build();
        }
      }
    }
    return getCreateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest,
      com.berkay.grpc.lib.HospitalReply> getGetHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHospital",
      requestType = com.berkay.grpc.lib.HospitalRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest,
      com.berkay.grpc.lib.HospitalReply> getGetHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest, com.berkay.grpc.lib.HospitalReply> getGetHospitalMethod;
    if ((getGetHospitalMethod = HospitalServiceGrpc.getGetHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetHospitalMethod = HospitalServiceGrpc.getGetHospitalMethod) == null) {
          HospitalServiceGrpc.getGetHospitalMethod = getGetHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.HospitalRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("GetHospital"))
              .build();
        }
      }
    }
    return getGetHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.EmptyRequest,
      com.berkay.grpc.lib.HospitalReply> getGetAllHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllHospital",
      requestType = com.berkay.grpc.lib.EmptyRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.EmptyRequest,
      com.berkay.grpc.lib.HospitalReply> getGetAllHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.EmptyRequest, com.berkay.grpc.lib.HospitalReply> getGetAllHospitalMethod;
    if ((getGetAllHospitalMethod = HospitalServiceGrpc.getGetAllHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetAllHospitalMethod = HospitalServiceGrpc.getGetAllHospitalMethod) == null) {
          HospitalServiceGrpc.getGetAllHospitalMethod = getGetAllHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.EmptyRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("GetAllHospital"))
              .build();
        }
      }
    }
    return getGetAllHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalModifyRequest,
      com.berkay.grpc.lib.HospitalReply> getModifyHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyHospital",
      requestType = com.berkay.grpc.lib.HospitalModifyRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalModifyRequest,
      com.berkay.grpc.lib.HospitalReply> getModifyHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalModifyRequest, com.berkay.grpc.lib.HospitalReply> getModifyHospitalMethod;
    if ((getModifyHospitalMethod = HospitalServiceGrpc.getModifyHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getModifyHospitalMethod = HospitalServiceGrpc.getModifyHospitalMethod) == null) {
          HospitalServiceGrpc.getModifyHospitalMethod = getModifyHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.HospitalModifyRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalModifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("ModifyHospital"))
              .build();
        }
      }
    }
    return getModifyHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest,
      com.berkay.grpc.lib.HospitalReply> getDeleteHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHospital",
      requestType = com.berkay.grpc.lib.HospitalRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest,
      com.berkay.grpc.lib.HospitalReply> getDeleteHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest, com.berkay.grpc.lib.HospitalReply> getDeleteHospitalMethod;
    if ((getDeleteHospitalMethod = HospitalServiceGrpc.getDeleteHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getDeleteHospitalMethod = HospitalServiceGrpc.getDeleteHospitalMethod) == null) {
          HospitalServiceGrpc.getDeleteHospitalMethod = getDeleteHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.HospitalRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("DeleteHospital"))
              .build();
        }
      }
    }
    return getDeleteHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.EmptyRequest,
      com.berkay.grpc.lib.HospitalReply> getDeleteAllHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllHospital",
      requestType = com.berkay.grpc.lib.EmptyRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.EmptyRequest,
      com.berkay.grpc.lib.HospitalReply> getDeleteAllHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.EmptyRequest, com.berkay.grpc.lib.HospitalReply> getDeleteAllHospitalMethod;
    if ((getDeleteAllHospitalMethod = HospitalServiceGrpc.getDeleteAllHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getDeleteAllHospitalMethod = HospitalServiceGrpc.getDeleteAllHospitalMethod) == null) {
          HospitalServiceGrpc.getDeleteAllHospitalMethod = getDeleteAllHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.EmptyRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("DeleteAllHospital"))
              .build();
        }
      }
    }
    return getDeleteAllHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest,
      com.berkay.grpc.lib.HospitalReply> getGetPatientsOfHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatientsOfHospital",
      requestType = com.berkay.grpc.lib.HospitalRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest,
      com.berkay.grpc.lib.HospitalReply> getGetPatientsOfHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalRequest, com.berkay.grpc.lib.HospitalReply> getGetPatientsOfHospitalMethod;
    if ((getGetPatientsOfHospitalMethod = HospitalServiceGrpc.getGetPatientsOfHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetPatientsOfHospitalMethod = HospitalServiceGrpc.getGetPatientsOfHospitalMethod) == null) {
          HospitalServiceGrpc.getGetPatientsOfHospitalMethod = getGetPatientsOfHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.HospitalRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatientsOfHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("GetPatientsOfHospital"))
              .build();
        }
      }
    }
    return getGetPatientsOfHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalPatientRequest,
      com.berkay.grpc.lib.HospitalReply> getAddPatientToHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPatientToHospital",
      requestType = com.berkay.grpc.lib.HospitalPatientRequest.class,
      responseType = com.berkay.grpc.lib.HospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalPatientRequest,
      com.berkay.grpc.lib.HospitalReply> getAddPatientToHospitalMethod() {
    io.grpc.MethodDescriptor<com.berkay.grpc.lib.HospitalPatientRequest, com.berkay.grpc.lib.HospitalReply> getAddPatientToHospitalMethod;
    if ((getAddPatientToHospitalMethod = HospitalServiceGrpc.getAddPatientToHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getAddPatientToHospitalMethod = HospitalServiceGrpc.getAddPatientToHospitalMethod) == null) {
          HospitalServiceGrpc.getAddPatientToHospitalMethod = getAddPatientToHospitalMethod =
              io.grpc.MethodDescriptor.<com.berkay.grpc.lib.HospitalPatientRequest, com.berkay.grpc.lib.HospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPatientToHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.berkay.grpc.lib.HospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("AddPatientToHospital"))
              .build();
        }
      }
    }
    return getAddPatientToHospitalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HospitalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub>() {
        @java.lang.Override
        public HospitalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceStub(channel, callOptions);
        }
      };
    return HospitalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HospitalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub>() {
        @java.lang.Override
        public HospitalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceBlockingStub(channel, callOptions);
        }
      };
    return HospitalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HospitalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub>() {
        @java.lang.Override
        public HospitalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceFutureStub(channel, callOptions);
        }
      };
    return HospitalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class HospitalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createHospital(com.berkay.grpc.lib.HospitalCreateRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHospitalMethod(), responseObserver);
    }

    /**
     */
    public void getHospital(com.berkay.grpc.lib.HospitalRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHospitalMethod(), responseObserver);
    }

    /**
     */
    public void getAllHospital(com.berkay.grpc.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllHospitalMethod(), responseObserver);
    }

    /**
     */
    public void modifyHospital(com.berkay.grpc.lib.HospitalModifyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyHospitalMethod(), responseObserver);
    }

    /**
     */
    public void deleteHospital(com.berkay.grpc.lib.HospitalRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHospitalMethod(), responseObserver);
    }

    /**
     */
    public void deleteAllHospital(com.berkay.grpc.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllHospitalMethod(), responseObserver);
    }

    /**
     */
    public void getPatientsOfHospital(com.berkay.grpc.lib.HospitalRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientsOfHospitalMethod(), responseObserver);
    }

    /**
     */
    public void addPatientToHospital(com.berkay.grpc.lib.HospitalPatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPatientToHospitalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.HospitalCreateRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_CREATE_HOSPITAL)))
          .addMethod(
            getGetHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.HospitalRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_GET_HOSPITAL)))
          .addMethod(
            getGetAllHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.EmptyRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_GET_ALL_HOSPITAL)))
          .addMethod(
            getModifyHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.HospitalModifyRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_MODIFY_HOSPITAL)))
          .addMethod(
            getDeleteHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.HospitalRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_DELETE_HOSPITAL)))
          .addMethod(
            getDeleteAllHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.EmptyRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_DELETE_ALL_HOSPITAL)))
          .addMethod(
            getGetPatientsOfHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.HospitalRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_GET_PATIENTS_OF_HOSPITAL)))
          .addMethod(
            getAddPatientToHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.berkay.grpc.lib.HospitalPatientRequest,
                com.berkay.grpc.lib.HospitalReply>(
                  this, METHODID_ADD_PATIENT_TO_HOSPITAL)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class HospitalServiceStub extends io.grpc.stub.AbstractAsyncStub<HospitalServiceStub> {
    private HospitalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceStub(channel, callOptions);
    }

    /**
     */
    public void createHospital(com.berkay.grpc.lib.HospitalCreateRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHospital(com.berkay.grpc.lib.HospitalRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllHospital(com.berkay.grpc.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyHospital(com.berkay.grpc.lib.HospitalModifyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHospital(com.berkay.grpc.lib.HospitalRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAllHospital(com.berkay.grpc.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatientsOfHospital(com.berkay.grpc.lib.HospitalRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientsOfHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPatientToHospital(com.berkay.grpc.lib.HospitalPatientRequest request,
        io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPatientToHospitalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class HospitalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HospitalServiceBlockingStub> {
    private HospitalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply createHospital(com.berkay.grpc.lib.HospitalCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply getHospital(com.berkay.grpc.lib.HospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply getAllHospital(com.berkay.grpc.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply modifyHospital(com.berkay.grpc.lib.HospitalModifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply deleteHospital(com.berkay.grpc.lib.HospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply deleteAllHospital(com.berkay.grpc.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply getPatientsOfHospital(com.berkay.grpc.lib.HospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientsOfHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.berkay.grpc.lib.HospitalReply addPatientToHospital(com.berkay.grpc.lib.HospitalPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPatientToHospitalMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class HospitalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HospitalServiceFutureStub> {
    private HospitalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> createHospital(
        com.berkay.grpc.lib.HospitalCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> getHospital(
        com.berkay.grpc.lib.HospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> getAllHospital(
        com.berkay.grpc.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> modifyHospital(
        com.berkay.grpc.lib.HospitalModifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> deleteHospital(
        com.berkay.grpc.lib.HospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> deleteAllHospital(
        com.berkay.grpc.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> getPatientsOfHospital(
        com.berkay.grpc.lib.HospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientsOfHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.berkay.grpc.lib.HospitalReply> addPatientToHospital(
        com.berkay.grpc.lib.HospitalPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPatientToHospitalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOSPITAL = 0;
  private static final int METHODID_GET_HOSPITAL = 1;
  private static final int METHODID_GET_ALL_HOSPITAL = 2;
  private static final int METHODID_MODIFY_HOSPITAL = 3;
  private static final int METHODID_DELETE_HOSPITAL = 4;
  private static final int METHODID_DELETE_ALL_HOSPITAL = 5;
  private static final int METHODID_GET_PATIENTS_OF_HOSPITAL = 6;
  private static final int METHODID_ADD_PATIENT_TO_HOSPITAL = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HospitalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HospitalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOSPITAL:
          serviceImpl.createHospital((com.berkay.grpc.lib.HospitalCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
          break;
        case METHODID_GET_HOSPITAL:
          serviceImpl.getHospital((com.berkay.grpc.lib.HospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
          break;
        case METHODID_GET_ALL_HOSPITAL:
          serviceImpl.getAllHospital((com.berkay.grpc.lib.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
          break;
        case METHODID_MODIFY_HOSPITAL:
          serviceImpl.modifyHospital((com.berkay.grpc.lib.HospitalModifyRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
          break;
        case METHODID_DELETE_HOSPITAL:
          serviceImpl.deleteHospital((com.berkay.grpc.lib.HospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
          break;
        case METHODID_DELETE_ALL_HOSPITAL:
          serviceImpl.deleteAllHospital((com.berkay.grpc.lib.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
          break;
        case METHODID_GET_PATIENTS_OF_HOSPITAL:
          serviceImpl.getPatientsOfHospital((com.berkay.grpc.lib.HospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
          break;
        case METHODID_ADD_PATIENT_TO_HOSPITAL:
          serviceImpl.addPatientToHospital((com.berkay.grpc.lib.HospitalPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.berkay.grpc.lib.HospitalReply>) responseObserver);
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

  private static abstract class HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HospitalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.berkay.grpc.lib.HospitalProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HospitalService");
    }
  }

  private static final class HospitalServiceFileDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier {
    HospitalServiceFileDescriptorSupplier() {}
  }

  private static final class HospitalServiceMethodDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HospitalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HospitalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HospitalServiceFileDescriptorSupplier())
              .addMethod(getCreateHospitalMethod())
              .addMethod(getGetHospitalMethod())
              .addMethod(getGetAllHospitalMethod())
              .addMethod(getModifyHospitalMethod())
              .addMethod(getDeleteHospitalMethod())
              .addMethod(getDeleteAllHospitalMethod())
              .addMethod(getGetPatientsOfHospitalMethod())
              .addMethod(getAddPatientToHospitalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
