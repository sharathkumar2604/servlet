package com.xworkz.mobiles.service;

import java.util.List;

import com.xworkz.mobiles.dto.MobileDto;

public interface MobileService {
	
public String save(MobileDto dto);

public List<MobileDto> readAll();

}
