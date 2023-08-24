package com.example.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6.model.HotelModel;
import com.example.day6.repository.HotelRepo;

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
	
	//sorting by asc
	
	public List<HotelModel> sortByAsc(String name)
	{
		return hrepo.findAll(Sort.by(name).ascending());
	}
	
	//sorting by desc
	
	public List<HotelModel> sortByDesc(String name)
	{
		return hrepo.findAll(Sort.by(name).descending());
	}
	
	//pagination
	public List<HotelModel> pagination(int pageNu,int pageSize)
	{
		Page<HotelModel> cont=hrepo.findAll(PageRequest.of(pageNu, pageSize));
		return cont.getContent();
	}
	
	//pagination and sorting
	public List<HotelModel> paginationAndSorting(int pageNu,int pageSize,String name)
	{
		Page<HotelModel> cont1=hrepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(name)));
		return cont1.getContent();
	}
	

}

