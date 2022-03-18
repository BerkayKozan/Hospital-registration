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
import java.util.List;
import java.util.function.Predicate;

@GrpcService
public class HospitalServerService extends HospitalServiceGrpc.HospitalServiceImplBase{

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
    public void createHospital(HospitalCreateRequest req, StreamObserver<HospitalReply> responseObserver) {
        Hospital hospital = new Hospital();
        hospital.setName(req.getName());
        hospitalRepository.save(hospital);
        HospitalReply reply = HospitalReply.newBuilder().setMessage("Hospital created with name: " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getHospital(HospitalRequest req, StreamObserver<HospitalReply> responseObserver) {
        Hospital hospital = hospitalRepository.findByName(req.getName());
        HospitalReply reply = HospitalReply.newBuilder().setMessage("Hospital retrieved with name: " + hospital.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    public void getAllHospital(EmptyRequest req, StreamObserver<HospitalReply> responseObserver) {
        Iterable<Hospital> hospitals = hospitalRepository.findAll();
        ArrayList<String> hospitalNames = new ArrayList<String>();
        for (Hospital hospital : hospitals) {
            hospitalNames.add(hospital.getName());
        }
        HospitalReply reply = HospitalReply.newBuilder().setMessage("All hospitals are: " + hospitalNames).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void modifyHospital(HospitalModifyRequest req, StreamObserver<HospitalReply> responseObserver) {
        Hospital hospital = hospitalRepository.findByName(req.getOldName());
        hospital.setName(req.getNewName());
        hospitalRepository.save(hospital);
        HospitalReply reply = HospitalReply.newBuilder().setMessage("Hospital name changed from " + req.getOldName() + " to " + req.getNewName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteHospital(HospitalRequest req, StreamObserver<HospitalReply> responseObserver) {
        Hospital hospital = hospitalRepository.findByName(req.getName());
        hospitalRepository.delete(hospital);
        HospitalReply reply = HospitalReply.newBuilder().setMessage("Hospital deleted with name: " + hospital.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    public void deleteAllHospital(EmptyRequest req, StreamObserver<HospitalReply> responseObserver) {
        hospitalRepository.deleteAll();
        HospitalReply reply = HospitalReply.newBuilder().setMessage("All hospitals are deleted").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getPatientsOfHospital(HospitalRequest req, StreamObserver<HospitalReply> responseObserver) {
        Hospital hospital = hospitalRepository.findByName(req.getName());
        List<String> patientNames = new ArrayList<String>();
        for(Patient p : hospital.getPatients()){
            patientNames.add(p.getName());
        }
            HospitalReply reply = HospitalReply.newBuilder().setMessage("All patients of hospital "+hospital.getName()+" are " + patientNames).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void addPatientToHospital(HospitalPatientRequest req, StreamObserver<HospitalReply> responseObserver) {
        Hospital hospital = hospitalRepository.findByName(req.getHospital());
        Patient patient = patientRepository.findByName(req.getPatient());
        if(patient == null){
            HospitalReply reply = HospitalReply.newBuilder().setMessage("No such patient exists.").build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        else if(hospital == null){
            HospitalReply reply = HospitalReply.newBuilder().setMessage("No such hospital exists.").build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        else {
            HospitalReply reply = HospitalReply.newBuilder().setMessage("New patient registered with name: " + req.getPatient() + " to the hospital: " + req.getHospital()).build();
            Predicate <Patient> patientExists = p -> p.getName() == patient.getName();
            if(hospital.getPatients().stream().anyMatch(patientExists)){
                reply = HospitalReply.newBuilder().setMessage("Patient " + req.getPatient() + " is already registered to the hospital: " + req.getHospital()).build();
            }
            else {
                hospital.addPatient(patient);
                hospitalRepository.save(hospital);
            }
            responseObserver.onNext(reply);
            responseObserver.onCompleted();

        }
    }
}
