package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.AdoptionModel;

public interface AdoptionRepo extends JpaRepository<AdoptionModel, Integer>{

}
