package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClinicController {

    @Autowired
    private ClinicService clinicService;


    @RequestMapping("/api/clinics")
    public List<Clinic> getAllClinics()
    {
        return clinicService.getAllClinics();
    }

    @RequestMapping(method= RequestMethod.POST, value="/api/clinic/register")
    public void registerClinic(@RequestBody Clinic clc)
    {
        clinicService.addClinic(clc);
    }
}
