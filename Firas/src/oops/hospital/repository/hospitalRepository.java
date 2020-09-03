package oops.hospital.repository;

import java.util.ArrayList;
import java.util.List;

import oops.hospital.model.Hospital;

public class hospitalRepository {

	private static List<Hospital> hospitaList = new ArrayList<>();
	
	public static void createHospitaList() {
		
		Hospital hospital = new Hospital();
		
		hospital.setPatient(56);
		hospital.setDivision("cardiology");
		hospital.setDate("march 12");
		hospital.setCondition("stable");
		
	Hospital hospital2 = new Hospital();
		
		hospital2.setPatient(70);
		hospital2.setDivision("pathology");
		hospital2.setDate("january 4");
		hospital2.setCondition("stable");
		
	Hospital hospital3 = new Hospital();
		
		hospital3.setPatient(23);
		hospital3.setDivision("respiratory");
		hospital3.setDate("april 30");
		hospital3.setCondition("recovering");
		
		hospitaList.add(hospital);
		hospitaList.add(hospital2);
		hospitaList.add(hospital3);
	}
	
	public static void addHospital(Hospital hospital) {
		System.out.println("\nadding hospital\n");
		hospitaList.add(hospital);
		return;
	}
	
	public static List<Hospital> findAll(){
		return hospitaList;
	}
	
	public static void deleteHospital(int index) {
		System.out.println("\ndeleting hospital\n");
		hospitaList.remove(index);
	}
	
	public static Hospital findByPatient(int patient) {
		for(Hospital p : hospitaList) {
			if(patient == p.getPatient()) {
				return p;
			}
		}
		return null;
	}
	
}
