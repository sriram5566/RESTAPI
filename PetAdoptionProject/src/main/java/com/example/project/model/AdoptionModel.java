package com.example.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PetAdoption")
public class AdoptionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PetId;
	private int age;
	@Column(name="Breeds")
	private String Breeds;
	private String Gender;
	private String Location;
	public int getPetId() {
		return PetId;
	}
	public void setPetId(int petId) {
		PetId = petId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreeds() {
		return Breeds;
	}
	public void setBreeds(String breeds) {
		Breeds = breeds;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
}
