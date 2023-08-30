package com.example.day9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day9.model.UsersModel;
import com.example.day9.repository.UsersRepo;


@RestController
@RequestMapping("/")
public class UsersController 
{
	@Autowired
	UsersRepo srepo;
	@PostMapping()
		public UsersModel saveDetails(@RequestBody UsersModel aj)
		{
			return  srepo.save(aj);
		}
	@GetMapping()
	public List<UsersModel>getDetails()
	{
		return srepo.findAll();
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id")int id)
	{
		srepo.deleteById((long) id);
		
		
		return "The id "+id+" is deleted";
	}
	
}