package com.example.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7.model.CafeModel;
import com.example.day7.repository.CafeRepo;

@Service
public class CafeService {
	
		@Autowired
		public CafeRepo hrepo;
		
		//post the data
		public String saveCafe(CafeModel h)
		{
			hrepo.save(h);
			return "Data is saved to database";
		}
			
		//get all the data
		public List<CafeModel> getAllrows()
		{
			return hrepo.getAllRows();
		}
				
		//get specific rows
		public List<CafeModel> getSpecrows(String ci,String name)
		{
			return hrepo.getSpecRows(ci, name);
		}
		
		//get by name
		
		public List<CafeModel> getbyname(String name)
		{
			return hrepo.getByname(name);
		}
		
		//delete the data
	
		public int deleterow(int id)
		{
			return hrepo.deletebyid(id);
		}
		
		//update the data
		
		public Integer updateRow(String ci,int id)
		{
			return hrepo.updateByid(ci, id);
		
		}
}
