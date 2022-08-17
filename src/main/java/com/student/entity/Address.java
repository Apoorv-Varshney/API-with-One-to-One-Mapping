package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Address {
	
	@Id
	private int addId;
	private String city;
	private String street;
	
	@OneToOne(mappedBy = "address")
	@JsonBackReference
	private Student student;

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(int addId, String city, String street) {
		super();
		this.addId = addId;
		this.city = city;
		this.street = street;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
