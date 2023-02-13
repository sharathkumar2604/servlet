package com.xworkz.mobiles.repo;

import java.util.List;

import com.xworkz.mobiles.dto.MobileDto;

public interface MobileRepo {

	public String save(MobileDto dto);

	public List<MobileDto> readAll();

}
