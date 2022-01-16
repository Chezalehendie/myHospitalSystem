package com.hendrina.myHospitalSystem.service;

import com.hendrina.myHospitalSystem.model.Patient;
import com.hendrina.myHospitalSystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository PatientRepository;
    @Override
    public Patient savePatient(Patient Patient) {
        return PatientRepository.save(Patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return PatientRepository.findAll();
    }
}
