package com.example.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6.model.HotelModel;

public interface HotelRepo extends JpaRepository<HotelModel, Integer>{

}
