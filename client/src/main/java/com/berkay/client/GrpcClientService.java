package com.berkay.client;

import com.berkay.grpc.lib.*;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientService {

    @GrpcClient("server")
    private HospitalServiceGrpc.HospitalServiceBlockingStub hospitalServiceStub;
    @GrpcClient("server")
    private PatientServiceGrpc.PatientServiceBlockingStub patientServiceStub;

    public String createHospital(final String name) {
        try {
            final HospitalReply response = this.hospitalServiceStub.createHospital(HospitalCreateRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String getHospital(final String name) {
        try {
            final HospitalReply response = this.hospitalServiceStub.getHospital(HospitalRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String getAllHospital() {
        try {
            final HospitalReply response = this.hospitalServiceStub.getAllHospital(EmptyRequest.newBuilder().build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String modifyHospital(final String oldName, final String newName) {
        try {
            final HospitalReply response = this.hospitalServiceStub.modifyHospital(HospitalModifyRequest.newBuilder().setOldName(oldName).setNewName(newName).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String deleteHospital(final String name) {
        try {
            final HospitalReply response = this.hospitalServiceStub.deleteHospital(HospitalRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String deleteAllHospital() {
        try {
            final HospitalReply response = this.hospitalServiceStub.deleteAllHospital(EmptyRequest.newBuilder().build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
    public String getPatientsOfHospital(final String name) {
        try {
            final HospitalReply response = this.hospitalServiceStub.getPatientsOfHospital(HospitalRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
    public String addPatientToHospital(final String patientName, final String hospitalName) {
        try {
            final HospitalReply response = this.hospitalServiceStub.addPatientToHospital(HospitalPatientRequest.newBuilder().setPatient(patientName).setHospital(hospitalName).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
    public String createPatient(final String name) {
        try {
            final PatientReply response = this.patientServiceStub.createPatient(PatientCreateRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String getPatient(final String name) {
        try {
            final PatientReply response = this.patientServiceStub.getPatient(PatientRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String getAllPatient() {
        try {
            final PatientReply response = this.patientServiceStub.getAllPatient(PatientEmptyRequest.newBuilder().build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String modifyPatient(final String oldName, final String newName) {
        try {
            final PatientReply response = this.patientServiceStub.modifyPatient(PatientModifyRequest.newBuilder().setOldName(oldName).setNewName(newName).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String deletePatient(final String name) {
        try {
            final PatientReply response = this.patientServiceStub.deletePatient(PatientRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String deleteAllPatient() {
        try {
            final PatientReply response = this.patientServiceStub.deleteAllPatient(PatientEmptyRequest.newBuilder().build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String getAllHospitalsOfPatient(final String name) {
        try {
            final PatientReply response = this.patientServiceStub.getAllHospitalsOfPatient(PatientRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

}
