package com.berkay.server;

import com.berkay.grpc.lib.*;
import com.berkay.server.HospitalServerService;
import com.berkay.server.model.Hospital;
import com.berkay.server.model.Patient;
import com.berkay.server.repository.HospitalRepository;
import com.berkay.server.repository.PatientRepository;
import io.grpc.internal.testing.StreamRecorder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
//@SpringBootTest
@DataJpaTest
//@ComponentScan(basePackages = {"com.berkay.server"})
//@ActiveProfiles("test")
public class PatientServerServiceTest {

    private PatientServerService myService;
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private PatientRepository patientRepository;

    @BeforeEach
    public void setup() {
        myService = new PatientServerService();
        myService.setHospitalRepository(hospitalRepository);
        myService.setPatientRepository(patientRepository);
        Hospital h = new Hospital();
        h.setName("Praxis");
        Patient p = new Patient();
        p.setName("Berkay");
        Patient p2 = new Patient();
        p2.setName("Emin");
        h.addPatient(p);
        hospitalRepository.save(h);
        patientRepository.save(p2);
        patientRepository.save(p);
    }

    @Test
    void testCreatePatient() throws Exception {
        PatientCreateRequest request = PatientCreateRequest.newBuilder()
                .setName("Max")
                .build();
        StreamRecorder<PatientReply> responseObserver = StreamRecorder.create();
        myService.createPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<PatientReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        PatientReply response = results.get(0);
        assertEquals(PatientReply.newBuilder()
                .setMessage("New patient created with name: Max")
                .build(), response);
    }

    @Test
    void testGetPatient() throws Exception {
        PatientRequest request = PatientRequest.newBuilder()
                .setName("Berkay")
                .build();
        StreamRecorder<PatientReply> responseObserver = StreamRecorder.create();
        myService.getPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<PatientReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        PatientReply response = results.get(0);
        assertEquals(PatientReply.newBuilder()
                .setMessage("Patient retrieved with name: Berkay")
                .build(), response);
    }

    @Test
    void testGetAllPatient() throws Exception {
        PatientEmptyRequest request = PatientEmptyRequest.newBuilder()
                .build();
        StreamRecorder<PatientReply> responseObserver = StreamRecorder.create();
        myService.getAllPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<PatientReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        PatientReply response = results.get(0);
        assertEquals(PatientReply.newBuilder()
                .setMessage("All patients are: [Emin, Berkay]")
                .build(), response);
    }

    @Test
    void testModifyPatient() throws Exception {
        PatientModifyRequest request = PatientModifyRequest.newBuilder()
                .setOldName("Berkay")
                .setNewName("Kai")
                .build();
        StreamRecorder<PatientReply> responseObserver = StreamRecorder.create();
        myService.modifyPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<PatientReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        PatientReply response = results.get(0);
        assertEquals(PatientReply.newBuilder()
                .setMessage("Patient name changed from Berkay to Kai")
                .build(), response);
    }

    @Test
    void deletePatient() throws Exception {
        PatientRequest request = PatientRequest.newBuilder()
                .setName("Berkay")
                .build();
        StreamRecorder<PatientReply> responseObserver = StreamRecorder.create();
        myService.deletePatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<PatientReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        PatientReply response = results.get(0);
        assertEquals(PatientReply.newBuilder()
                .setMessage("Patient deleted with name: Berkay")
                .build(), response);
    }

    @Test
    void deleteAllPatient() throws Exception {
        PatientEmptyRequest request = PatientEmptyRequest.newBuilder()
                .build();
        StreamRecorder<PatientReply> responseObserver = StreamRecorder.create();
        myService.deleteAllPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<PatientReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        PatientReply response = results.get(0);
        assertEquals(PatientReply.newBuilder()
                .setMessage("All patients are deleted")
                .build(), response);
    }

    @Test
    void testGetAllHospitalsOfPatient() throws Exception {
        PatientRequest request = PatientRequest.newBuilder()
                .setName("Berkay")
                .build();
        StreamRecorder<PatientReply> responseObserver = StreamRecorder.create();
        myService.getAllHospitalsOfPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<PatientReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        PatientReply response = results.get(0);
        assertEquals(PatientReply.newBuilder()
                .setMessage("Patient Berkay is registered to [Praxis]")
                .build(), response);
    }
}