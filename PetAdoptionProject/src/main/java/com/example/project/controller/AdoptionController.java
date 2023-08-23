package com.example.project.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.AdoptionModel;
import com.example.project.service.AdoptionService;

@RestController
public class AdoptionController {

	@Autowired
	public AdoptionService aserv;
	
	//post mapping
	
	@PostMapping("/postAdoption")
	public String postAdoption(@RequestBody AdoptionModel hr)
	{
		aserv.saveAdoption(hr);
		return "Data is saved to the Database";
	}
	
	//get mapping
	
	@GetMapping("/getAdoption")
	public List<AdoptionModel> getAdoptionInfo()
	{
		return aserv.getAdoption();
	}
	
	//put mapping
	
	@PutMapping("/updateAdoption")
	public AdoptionModel updateHotelInfo(@RequestBody AdoptionModel ha)
	{
		return aserv.updateHotel(ha);
	}
	
	//Delete Mapping
	
	@DeleteMapping("/deleteAdoptionif/{id}")
	public ResponseEntity<String> deleteAdoptionInfo(@PathVariable int id)
	{
		boolean deleted = aserv.deleteAdoptionif(id);
		
		if(deleted)
		{
			return ResponseEntity.ok("Adoption with ID " + id + " deleted successfully");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Adoption with ID " + id + " not found");
		}
	}
	
	//Delete Mapping using path variable
	
	@DeleteMapping("/DeleteAdoption/{id}")
	public String removeAdoption(@PathVariable("id") int hid)
	{
		aserv.deleteAdoption(hid);
		return "Adoption with Id "+hid+" id deleted";
	}
	
	//delete mapping using request parm
	

	@DeleteMapping("/byReqParm")
	public String removeByRequestParm(@RequestParam("id") int id)
	{
		aserv.deleteAdoption(id);
		return "Adoption with Id "+id+" id deleted";
	}
	
	//getUserById
	
	@GetMapping("/users/(userId)")
	public ResponseEntity<?> getUserbyId(@PathVariable int userId)
	{
		Optional<AdoptionModel> adoption = aserv.getUserId(userId);
		if(adoption != null)
		{
			return ResponseEntity.ok(adoption);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID");
	}
	
}