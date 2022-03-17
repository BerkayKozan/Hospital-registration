package com.berkay.server;

import com.berkay.grpc.lib.HospitalCreateRequest;
import com.berkay.grpc.lib.HospitalReply;
import com.berkay.grpc.lib.HospitalRequest;
import com.berkay.server.HospitalServerService;
import com.berkay.server.repository.HospitalRepository;
import io.grpc.internal.testing.StreamRecorder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class HospitalServerServiceTest {

    private HospitalServerService myService;

    @BeforeEach
    public void setup() {
        myService = new HospitalServerService();
        HospitalRepository hospitalRepository = mock(HospitalRepository.class);
        myService.setHospitalRepository(hospitalRepository);
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


}