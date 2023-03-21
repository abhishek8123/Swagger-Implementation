package com.cashlink.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashlink.pkg.entity.Docter;
import com.cashlink.pkg.service.DoctorService;

@RestController
@RequestMapping(value = "/docterRegistration")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/save")
	public Docter saveDocter(@RequestBody Docter docter) {
		
		doctorService.savedocter(docter);
		return docter;
	}

}
