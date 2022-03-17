package com.berkay.server.repository;

import com.berkay.server.model.Hospital;
import com.berkay.server.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {
    Hospital findByName(String name);
    List <Hospital> findByPatientsContaining(Patient patient);
}

