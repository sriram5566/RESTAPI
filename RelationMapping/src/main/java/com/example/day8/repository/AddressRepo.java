package com.example.day8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.model.AddressModel;

public interface AddressRepo extends JpaRepository <AddressModel,Integer>{

}