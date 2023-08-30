package com.example.day9.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.day9.model.UsersModel;

public interface UsersRepo extends JpaRepository<UsersModel,Long>{

}
