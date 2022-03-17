// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hospital.proto

package com.berkay.grpc.lib;

public final class HospitalProto {
  private HospitalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmptyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmptyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HospitalCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HospitalCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HospitalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HospitalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HospitalModifyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HospitalModifyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HospitalPatientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HospitalPatientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HospitalReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HospitalReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016hospital.proto\"\016\n\014EmptyRequest\"%\n\025Hosp" +
      "italCreateRequest\022\014\n\004name\030\001 \001(\t\"\037\n\017Hospi" +
      "talRequest\022\014\n\004name\030\001 \001(\t\";\n\025HospitalModi" +
      "fyRequest\022\020\n\010old_name\030\001 \001(\t\022\020\n\010new_name\030" +
      "\002 \001(\t\";\n\026HospitalPatientRequest\022\017\n\007patie" +
      "nt\030\001 \001(\t\022\020\n\010hospital\030\002 \001(\t\" \n\rHospitalRe" +
      "ply\022\017\n\007message\030\001 \001(\t2\333\003\n\017HospitalService" +
      "\022:\n\016CreateHospital\022\026.HospitalCreateReque" +
      "st\032\016.HospitalReply\"\000\0221\n\013GetHospital\022\020.Ho" +
      "spitalRequest\032\016.HospitalReply\"\000\0221\n\016GetAl" +
      "lHospital\022\r.EmptyRequest\032\016.HospitalReply" +
      "\"\000\022:\n\016ModifyHospital\022\026.HospitalModifyReq" +
      "uest\032\016.HospitalReply\"\000\0224\n\016DeleteHospital" +
      "\022\020.HospitalRequest\032\016.HospitalReply\"\000\0224\n\021" +
      "DeleteAllHospital\022\r.EmptyRequest\032\016.Hospi" +
      "talReply\"\000\022;\n\025GetPatientsOfHospital\022\020.Ho" +
      "spitalRequest\032\016.HospitalReply\"\000\022A\n\024AddPa" +
      "tientToHospital\022\027.HospitalPatientRequest" +
      "\032\016.HospitalReply\"\000B&\n\023com.berkay.grpc.li" +
      "bB\rHospitalProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EmptyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EmptyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmptyRequest_descriptor,
        new java.lang.String[] { });
    internal_static_HospitalCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HospitalCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HospitalCreateRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_HospitalRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_HospitalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HospitalRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_HospitalModifyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_HospitalModifyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HospitalModifyRequest_descriptor,
        new java.lang.String[] { "OldName", "NewName", });
    internal_static_HospitalPatientRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_HospitalPatientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HospitalPatientRequest_descriptor,
        new java.lang.String[] { "Patient", "Hospital", });
    internal_static_HospitalReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_HospitalReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HospitalReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
