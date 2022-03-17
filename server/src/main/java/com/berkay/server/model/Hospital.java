package com.berkay.server.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Hospital {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Patient> patients = new HashSet<Patient>() {};
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set <Patient> getPatients() { return patients; }
    public void addPatient(Patient p){
        this.patients.add(p);
    }
    public void removePatient(Patient p) {this.patients.removeIf(x -> x.getName() == p.getName());}
    public void setPatients(Set <Patient> patientSet){this.patients = patientSet;}
}
