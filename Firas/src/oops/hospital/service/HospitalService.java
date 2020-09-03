package oops.hospital.service;

import java.util.List;

import oops.hospital.model.Hospital;
import oops.hospital.repository.hospitalRepository;

public class HospitalService {

	public HospitalService() {
		hospitalRepository.createHospitaList();
	}
	
	public void addHospital(Hospital hospital) {
		hospitalRepository.addHospital(hospital);
	}
	
	public static List<Hospital> findAll(){
		return hospitalRepository.findAll();
	}
	
	public void deleteHospital(int index) {
		hospitalRepository.deleteHospital(index);
	}
	
	public Hospital findByPatient(int patient) {
		return hospitalRepository.findByPatient(patient);
		
	}
}