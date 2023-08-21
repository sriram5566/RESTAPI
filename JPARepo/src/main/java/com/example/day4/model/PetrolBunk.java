package com.example.day4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="petrolbunk")
public class PetrolBunk {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sapCode;
	@Column(name="bunkName")
	private String bunkName;
	private String address;
	public int getSapCode() {
		return sapCode;
	}
	public void setSapCode(int sapCode) {
		
		this.sapCode = sapCode;
	}
	public String getBunkName() {
		return bunkName;
	}
	public void setBunkName(String bunkName) {
		this.bunkName = bunkName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
