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
public class HospitalServerServiceTest {

    private HospitalServerService myService;
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private PatientRepository patientRepository;

    @BeforeEach
    public void setup() {
        myService = new HospitalServerService();
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
    void testCreateHospital() throws Exception {
        HospitalCreateRequest request = HospitalCreateRequest.newBuilder()
                .setName("Klinikum")
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.createHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("Hospital created with name: Klinikum")
                .build(), response);
    }

    @Test
    void testGetHospital() throws Exception {
        HospitalRequest request = HospitalRequest.newBuilder()
                .setName("Praxis")
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.getHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("Hospital retrieved with name: Praxis")
                .build(), response);
    }
    @Test
    void testGetAllHospital() throws Exception {
        EmptyRequest request = EmptyRequest.newBuilder()
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.getAllHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("All hospitals are: [Praxis]")
                .build(), response);
    }

    @Test
    void testModifyHospital() throws Exception {
        HospitalModifyRequest request = HospitalModifyRequest.newBuilder()
                .setOldName("Praxis")
                .setNewName("Klinikum")
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.modifyHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("Hospital name changed from Praxis to Klinikum")
                .build(), response);
    }
    @Test
    void deleteHospital() throws Exception {
        HospitalRequest request = HospitalRequest.newBuilder()
                .setName("Praxis")
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.deleteHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("Hospital deleted with name: Praxis")
                .build(), response);
    }

    @Test
    void deleteAllHospital() throws Exception {
        EmptyRequest request = EmptyRequest.newBuilder()
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.deleteAllHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("All hospitals are deleted")
                .build(), response);
    }
    @Test
    void testGetPatientsOfHospital() throws Exception {
        HospitalRequest request = HospitalRequest.newBuilder()
                .setName("Praxis")
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.getPatientsOfHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("All patients of hospital Praxis are [Berkay]")
                .build(), response);
    }

    @Test
    void testAddPatientToHospital() throws Exception {
        HospitalPatientRequest request = HospitalPatientRequest.newBuilder()
                .setPatient("Emin")
                .setHospital("Praxis")
                .build();
        StreamRecorder<HospitalReply> responseObserver = StreamRecorder.create();
        myService.addPatientToHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<HospitalReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
        HospitalReply response = results.get(0);
        assertEquals(HospitalReply.newBuilder()
                .setMessage("New patient registered with name: Emin to the hospital: Praxis")
                .build(), response);
    }
}