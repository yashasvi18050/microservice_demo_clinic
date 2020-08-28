package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClinicService {

    @Autowired
    private ClinicRepo clinicRepo;


    public List<Clinic> getAllClinics()
    {

        List<Clinic> clinics= new ArrayList<>();
        clinicRepo.findAll().forEach(clinics::add);
        return clinics;
    }


    public void addClinic(Clinic clc)
    {
        clinicRepo.save(clc);
    }


}
