package com.hendrina.myHospitalSystem.service;

import com.hendrina.myHospitalSystem.model.Patient;

import java.util.List;

public interface PatientService  {
    public Patient savePatient(Patient Patient);
    public List<Patient> getAllPatients();
}
