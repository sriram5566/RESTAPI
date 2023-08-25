package com.example.day7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.day7.model.CafeModel;

import jakarta.transaction.Transactional;

public interface CafeRepo extends JpaRepository<CafeModel, Integer>{

	//native Query
	
	//@Query(value="select * from cafemodel", nativeQuery = true)
	
	//jpql query
	
	@Query("select h from CafeModel h")
	public List<CafeModel> getAllRows();
	
	//@Query(value="select * from cafemodel where cafename like %?1%",nativeQuery = true)
	
	//jpql query
	
	@Query("select h from CafeModel h where h.city = :ci and h.cafename = :name")
	public List<CafeModel> getByname(@Param("name") String name);
		
	//@Query(value="select * from cafemodel where city=:ci and cafename=:name",nativeQuery = true )
	
	//jpql query 
	
	@Query("select h from CafeModel h where h.cafename like %?1%")
	public List<CafeModel> getSpecRows(@Param("ci") String ci,@Param("name") String name);
		
	//Delete using native query
	
	@Modifying
	@Transactional
	//@Query(value="delete from cafemodel where cafe_id=:id",nativeQuery=true)
	
	//jpql query
	@Query("delete from CafeModel h where h.cafeId=:id")
	public int deletebyid(@Param("id") int id);

	
	//Update the native query
	
	@Modifying
	@Transactional
	//@Query(value="update cafemodel set city=:ci where cafe_id=:id",nativeQuery = true)
	
	//jpql query
	@Query("update CafeModel h set h.city = :ci where h.cafeId = :id")
	public Integer updateByid(@Param("ci") String ci,@Param("id") int id);

		
}
