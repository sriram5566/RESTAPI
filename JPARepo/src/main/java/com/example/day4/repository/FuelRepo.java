package com.example.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4.model.PetrolBunk;

public interface FuelRepo extends JpaRepository<PetrolBunk, Integer>{

}
