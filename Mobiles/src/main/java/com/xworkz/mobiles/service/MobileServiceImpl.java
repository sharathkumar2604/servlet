package com.xworkz.mobiles.service;

import java.util.List;

import com.xworkz.mobiles.dto.MobileDto;
import com.xworkz.mobiles.repo.MobileRepo;
import com.xworkz.mobiles.repo.MobileRepoImpl;

public class MobileServiceImpl implements MobileService {

	MobileRepo repo = new MobileRepoImpl();
	
	@Override
	public String save(MobileDto dto) {

		if(dto!=null)
		{
			System.out.println("valid dto");
			return repo.save(dto);
		}
		
		
		return null;
	}

	@Override
	public List<MobileDto> readAll() {

		
		return repo.readAll();
	}

}
