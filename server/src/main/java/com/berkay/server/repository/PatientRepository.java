package com.berkay.server.repository;

import com.berkay.server.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {
    Patient findByName(String name);
}
