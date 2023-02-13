package com.xworkz.hospital.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="hospital")
//@NamedQuery(name="readAll" , query="select dt fromm HospitalDto dt")
public class HospitalDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	private String noOfWards;
	private String noOfNurse;
	private String noOfDoctors;
	
	public HospitalDto() {
		
	}

	public HospitalDto(String name, String location, String noOfWards, String noOfNurse, String noOfDoctors) {
		this.name = name;
		this.location = location;
		this.noOfWards = noOfWards;
		this.noOfNurse = noOfNurse;
		this.noOfDoctors = noOfDoctors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNoOfWards() {
		return noOfWards;
	}

	public void setNoOfWards(String noOfWards) {
		this.noOfWards = noOfWards;
	}

	public String getNoOfNurse() {
		return noOfNurse;
	}

	public void setNoOfNurse(String noOfNurse) {
		this.noOfNurse = noOfNurse;
	}

	public String getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(String noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	@Override
	public String toString() {
		return "HospitalDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfWards=" + noOfWards
				+ ", noOfNurse=" + noOfNurse + ", noOfDoctors=" + noOfDoctors + "]";
	}
	
	


}
