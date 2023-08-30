package com.example.day9.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;



@Entity
public class UsersModel{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="uid")
	private long uid;
	private String name;
	private String email;
	private String password;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_id",referencedColumnName="uid")
	private List<AddressModel>address;
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AddressModel> getAddress() {
		return address;
	}
	public void setAddress(List<AddressModel> address) {
		this.address = address;
	}
	
	
	
	
}