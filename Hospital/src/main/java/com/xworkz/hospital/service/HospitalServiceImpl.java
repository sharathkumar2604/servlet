package com.xworkz.hospital.service;

import java.util.List;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.repo.HospitalRepo;
import com.xworkz.hospital.repo.HospitalRepoImpl;

public class HospitalServiceImpl implements HospitalService {

	HospitalRepo repo = new HospitalRepoImpl();

	@Override
	public String save(HospitalDto dto) {
		if (dto != null) {
			System.out.println("valid dto");
			repo.save(dto);
			return "i am going to repo";

		}

		return null;
	}

//	@Override
//	public List<HospitalDto> readAll() {
//
//		
//		return repo.readAll();
//	}

	
}
