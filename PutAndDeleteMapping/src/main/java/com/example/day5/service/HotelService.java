package com.example.day5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day5.model.HotelModel;
import com.example.day5.repository.HotelRepo;

@Service
public class HotelService {
	
	@Autowired
	public HotelRepo hrepo;
	
	//post the data
	public String saveHotel(HotelModel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	
	//get the data
	
	public List<HotelModel> getHotel()
	{
		return hrepo.findAll();
	}
	
	//update the data(put)
	
	public HotelModel updateHotel(HotelModel hm)
	{
		return hrepo.saveAndFlush(hm);
	}
	
	//delete if id is present
	
	public boolean deleteHotelif(int hotelId)
	{
		if(hrepo.existsById(hotelId))
		{
			hrepo.deleteById(hotelId);
			return true;
		}
		return false;
	}
	
	//delete the data
	
	public void deleteHotel(int hotel_id)
	{
		System.out.println("Deleted");
		hrepo.deleteById(hotel_id);
	}
	
	//get mapping by id
	
	public Optional<HotelModel> getUserId(int userId)
	{
		Optional<HotelModel> hotel=hrepo.findById(userId);
		if(hotel.isPresent())
		{
			return hotel;
		}
		return null;
	}

}
