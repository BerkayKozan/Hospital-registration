package com.berkay.server;

import com.berkay.server.model.Hospital;
import com.berkay.server.model.Patient;
import com.berkay.server.repository.HospitalRepository;
import com.berkay.server.repository.PatientRepository;
import io.grpc.stub.StreamObserver;
import com.berkay.grpc.lib.*;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@GrpcService
public class PatientServerService extends PatientServiceGrpc.PatientServiceImplBase{

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    public void setHospitalRepository(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }
    @Autowired
    public void setPatientRepository(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Override
    public void createPatient(PatientCreateRequest req, StreamObserver<PatientReply> responseObserver) {
        Patient patient = new Patient();
        patient.setName(req.getName());
        patientRepository.save(patient);
        PatientReply reply = PatientReply.newBuilder().setMessage("New patient created with name: " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getPatient(PatientRequest req, StreamObserver<PatientReply> responseObserver) {
        Patient patient = patientRepository.findByName(req.getName());
        PatientReply reply = PatientReply.newBuilder().setMessage("Patient retrieved with name: " + patient.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllPatient(PatientEmptyRequest req, StreamObserver<PatientReply> responseObserver) {
        Iterable<Patient> patients = patientRepository.findAll();
        ArrayList<String> patientNames = new ArrayList<String>();
        for (Patient patient : patients) {
            patientNames.add(patient.getName());
        }
        PatientReply reply = PatientReply.newBuilder().setMessage("All patients are: " + patientNames).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void modifyPatient(PatientModifyRequest req, StreamObserver<PatientReply> responseObserver) {
        Patient patient = patientRepository.findByName(req.getOldName());
        patient.setName(req.getNewName());
        patientRepository.save(patient);
        PatientReply reply = PatientReply.newBuilder().setMessage("Patient name changed from " + req.getOldName() + " to " + req.getNewName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deletePatient(PatientRequest req, StreamObserver<PatientReply> responseObserver) {
        Patient patient = patientRepository.findByName(req.getName());
        List <Hospital> hospitalList = hospitalRepository.findByPatientsContaining(patient);
        for(Hospital h : hospitalList){
            h.removePatient(patient);
            hospitalRepository.save(h);
        }
        patientRepository.delete(patient);
        PatientReply reply = PatientReply.newBuilder().setMessage("Patient deleted with name: " + patient.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    public void deleteAllPatient(PatientEmptyRequest req, StreamObserver<PatientReply> responseObserver) {
        Iterable<Hospital> hospitals = hospitalRepository.findAll();
        for (Hospital hospital : hospitals) {
            hospital.setPatients(new HashSet<Patient>());
            hospitalRepository.save(hospital);
        }
        patientRepository.deleteAll();
        PatientReply reply = PatientReply.newBuilder().setMessage("All patients are deleted").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    public void getAllHospitalsOfPatient(PatientRequest req, StreamObserver<PatientReply> responseObserver) {
        Patient patient = patientRepository.findByName(req.getName());
        List <Hospital> hospitalList = hospitalRepository.findByPatientsContaining(patient);
        List <String> hospitalNames = new ArrayList<String>();
        for(Hospital h : hospitalList){
            hospitalNames.add(h.getName());
        }
        PatientReply reply = PatientReply.newBuilder().setMessage("Patient "+ req.getName() + " is registered to "+ hospitalNames).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }


}
