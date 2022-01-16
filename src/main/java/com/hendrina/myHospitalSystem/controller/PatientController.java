package com.hendrina.myHospitalSystem.controller;

import com.hendrina.myHospitalSystem.model.Patient;
import com.hendrina.myHospitalSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")

public class PatientController {
    @Autowired
    private PatientService PatientService;
    @PostMapping("/add")
    public String add(@RequestBody Patient Patient){
        PatientService.savePatient(Patient);
        return "new Patient is added";
    }
    @GetMapping("/getAll")
    public List<Patient> getAllPatients(){
        return PatientService.getAllPatients();
    }
}
