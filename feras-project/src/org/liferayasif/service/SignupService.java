package org.liferayasif.service;

import org.liferayasif.model.Signup;
import org.liferayasif.repository.SignupRepository;

public class SignupService {

	public SignupService() {
		SignupRepository.ConnectionOpen();
	}
	
	
	public void create(Signup signup) {
		SignupRepository.create(signup);
	}
}
