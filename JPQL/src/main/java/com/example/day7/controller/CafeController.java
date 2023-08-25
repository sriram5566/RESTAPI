package com.example.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day7.model.CafeModel;
import com.example.day7.service.CafeService;

@RestController
public class CafeController {
	
	@Autowired
	public CafeService hserv;
	
	//post mapping
	
	@PostMapping("/postCafe")
	public String postCafe(@RequestBody CafeModel hr)
	{
		hserv.saveCafe(hr);
		return "Data is saved to the Database";
	}
	
	//get all the data
	
	@GetMapping("/getAllrows")
	public List<CafeModel> getallRows()
	{
		return hserv.getAllrows();
	}
		 
	//get specific data
		 
	@GetMapping("/getSpecific/{add}/{name}")
	public List<CafeModel> getSpec(@PathVariable("add") String add,@PathVariable("name") String name)
	{
		return hserv.getSpecrows(add, name);
	}
	
	//get by name
	
	@GetMapping("/getByName/{name}")
    public List<CafeModel> getByname(@PathVariable("name") String name) 
	{
        return hserv.getbyname(name);
    }
	
	//delete the data

	@DeleteMapping("/deletebyid/{id}")
	public String deleterowbyid(@PathVariable("id") int id)
	{
		return hserv.deleterow(id)+" rows deleted";
		
	}
	
	//update the data

    @PutMapping("/updateId/{add}/{id}")
    public String updateInfo(@PathVariable("ci") String ci, @PathVariable("id") int id) 
    {
        return hserv.updateRow(ci, id) + " rows updated";
    }

}
