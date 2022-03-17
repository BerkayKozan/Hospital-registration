package com.berkay.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping(value = "/createHospital", method = RequestMethod.POST)
    public String printMessage(@RequestParam(defaultValue = "Klinikum") String name) {
        return grpcClientService.createHospital(name);
    }

    @RequestMapping(value = "/getHospital", method = RequestMethod.GET)
    public String printMessage1(@RequestParam(defaultValue = "Klinikum") String name) {
        return grpcClientService.getHospital(name);
    }

    @RequestMapping(value = "/getAllHospital", method = RequestMethod.GET)
    public String printMessage2() {
        return grpcClientService.getAllHospital();
    }

    @RequestMapping(value = "/modifyHospital", method = RequestMethod.PUT)
    public String printMessage3(@RequestParam String oldName, @RequestParam String newName) {
        return grpcClientService.modifyHospital(oldName, newName);
    }

    @RequestMapping(value = "/deleteHospital", method = RequestMethod.DELETE)
    public String printMessage4(@RequestParam(defaultValue = "Klinikum") String name) {
        return grpcClientService.deleteHospital(name);
    }

    @RequestMapping(value = "/deleteAllHospital", method = RequestMethod.DELETE)
    public String printMessage5() {
        return grpcClientService.deleteAllHospital();
    }

    @RequestMapping(value = "/createPatient", method = RequestMethod.POST)
    public String printMessage6(@RequestParam(defaultValue = "Berkay") String name) {
        return grpcClientService.createPatient(name);
    }

    @RequestMapping(value = "/getPatient", method = RequestMethod.GET)
    public String printMessage7(@RequestParam(defaultValue = "Berkay") String name) {
        return grpcClientService.getPatient(name);
    }

    @RequestMapping(value = "/getAllPatient", method = RequestMethod.GET)
    public String printMessage8() {
        return grpcClientService.getAllPatient();
    }

    @RequestMapping(value = "/modifyPatient", method = RequestMethod.PUT)
    public String printMessage9(@RequestParam String oldName, @RequestParam String newName) {
        return grpcClientService.modifyPatient(oldName, newName);
    }

    @RequestMapping(value = "/deletePatient", method = RequestMethod.DELETE)
    public String printMessage10(@RequestParam(defaultValue = "Berkay") String name) {
        return grpcClientService.deletePatient(name);
    }

    @RequestMapping(value = "/deleteAllPatient", method = RequestMethod.DELETE)
    public String printMessage11() {
        return grpcClientService.deleteAllPatient();
    }

    @RequestMapping(value = "/getPatientsOfHospital", method = RequestMethod.GET)
    public String printMessage12(@RequestParam(defaultValue = "Klinikum") String name) {
        return grpcClientService.getPatientsOfHospital(name);
    }

    @RequestMapping(value = "/addPatientToHospital", method = RequestMethod.PUT)
    public String printMessage13(@RequestParam(defaultValue = "Berkay") String patientName, @RequestParam(defaultValue = "Klinikum") String hospitalName) {
        return grpcClientService.addPatientToHospital(patientName, hospitalName);
    }

    @RequestMapping(value = "/getAllHospitalsOfPatient", method = RequestMethod.GET)
    public String printMessage14(@RequestParam(defaultValue = "Berkay") String name) {
        return grpcClientService.getAllHospitalsOfPatient(name);
    }
}
