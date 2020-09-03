package oops.hospital.controller;

import java.util.List;

import oops.hospital.model.Hospital;
import oops.hospital.service.HospitalService;

public class HospitalController {
	
	public static void main(String[] args) {
		
		HospitalService hospitalService = new HospitalService();
		
		System.out.println("all hospitals");
		List<Hospital> hosList = HospitalService.findAll();			
		for(Hospital hospital : hosList) {
			System.out.println(hospital);
		}
		
		Hospital hospital = new Hospital();
		
		hospital.setPatient(77);
		hospital.setDivision("ICU");
		hospital.setDate("july 12");
		hospital.setCondition("critical");
		
		System.out.println(hospital);
		
		hospitalService.addHospital(hospital);
		
		System.out.println("-------------new data added---------------------------\n");

		List<Hospital> hosList2 = HospitalService.findAll();
		for(Hospital hospital1 : hosList2) {
			System.out.println(hospital1);
		}
		
		// deleting
		hospitalService.deleteHospital(3);
		hosList = hospitalService.findAll();
		System.out.println("-------------new data deleted---------------------------\n");
		
		for(Hospital hospital1: hosList2) {
			System.out.println(hospital1);
		}
	}

}
