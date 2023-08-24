package com.example.day6.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6.model.HotelModel;
import com.example.day6.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	public HotelService hserv;
	
	//post mapping
	
	@PostMapping("/postHotel")
	public String postHotel(@RequestBody HotelModel hr)
	{
		hserv.saveHotel(hr);
		return "Data is saved to the Database";
	}
	
	//get mapping
	
	@GetMapping("/getHotel")
	public List<HotelModel> getHotelInfo()
	{
		return hserv.getHotel();
	}
	
	//sort by asc
	
	@GetMapping("/sortAsc/{name}")
	public List<HotelModel> sortasc(@PathVariable("name") String name)
	{
		return hserv.sortByAsc(name);
	}
	
	//sort by desc
	
	@GetMapping("/sortDesc/{name}")
	public List<HotelModel> sortdesc(@PathVariable("name") String name)
	{
		return hserv.sortByDesc(name);
	}
	
	//pagination
	
	@GetMapping("/pagination/{num}/{size}")
	public List<HotelModel> paginationEx(@PathVariable("num") int num, @PathVariable("size") int size)
	{
		return hserv.pagination(num, size);
	}
	
	//pagination and sorting
	@GetMapping("/paginationAndSort/{num}/{size}/{name}")
	public List<HotelModel> paginationAndSortingEx(@PathVariable("num") int num, @PathVariable("size") int size, @PathVariable("name") String name)
	{
		return hserv.paginationAndSorting(num, size, name);
	}
}