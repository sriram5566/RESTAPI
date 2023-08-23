package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.AdoptionModel;
import com.example.project.repository.AdoptionRepo;

@Service
public class AdoptionService {
	
	@Autowired
	public AdoptionRepo arepo;
	
	//post the data
	public String saveAdoption(AdoptionModel h)
	{
		arepo.save(h);
		return "Data is saved to database";
	}
	
	//get the data
	
	public List<AdoptionModel> getAdoption()
	{
		return arepo.findAll();
	}
	
	//update the data(put)
	
	public AdoptionModel updateHotel(AdoptionModel hm)
	{
		return arepo.saveAndFlush(hm);
	}
	
	//delete if id is present
	
	public boolean deleteAdoptionif(int AdoptionId)
	{
		if(arepo.existsById(AdoptionId))
		{
			arepo.deleteById(AdoptionId);
			return true;
		}
		return false;
	}
	
	//delete the data
	
	public void deleteAdoption(int adoption_id)
	{
		System.out.println("Deleted");
		arepo.deleteById(adoption_id);
	}
	
	//get mapping by id
	
	public Optional<AdoptionModel> getUserId(int userId)
	{
		Optional<AdoptionModel> adoption=arepo.findById(userId);
		if(adoption.isPresent())
		{
			return adoption;
		}
		return null;
	}

}
