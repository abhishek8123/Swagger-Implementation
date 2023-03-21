package com.cashlink.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cashlink.pkg.entity.Docter;
import com.cashlink.pkg.repository.DocterRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DocterRepository docterRepo;

	public void savedocter(Docter docter) {
		
		docterRepo.save(docter);
		
		
	}

}
