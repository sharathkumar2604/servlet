package com.xworkz.mobiles.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "mobile")
@NamedQuery(name = "readAll", query = "select dt from MobileDto dt")
public class MobileDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String name;
	private String RAM;
	private String color;
	private String price;

	public MobileDto() {
	}

	public MobileDto(String name, String ram, String color, String price) {
		this.name = name;
		this.RAM = ram;
		this.color = color;
		this.price = price;
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

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String ram) {
		RAM = ram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MobileDto [id=" + id + ", name=" + name + ", RAM=" + RAM + ", color=" + color + ", price=" + price
				+ "]";
	}

}
