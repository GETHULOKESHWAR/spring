package com.spring.Computer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.spring.Computer.model.Computer;







public interface ComputerRepository extends JpaRepository<Computer,Integer>{
	
	
	
	//named parameter
	@Query("select s from Computer s where s.brand=:brand")
	public List<Computer>getComputerByBrand(String brand);
    
	@Modifying
	@Query("delete from Computer s  where s.brand=?1")
	public int deleteComputerByBrand(String brand);
	
	@Modifying
	@Query("update Computer s set s.brand=?1 where s.price=?2")
	public int UpdateComputerByBrand(String brand,String price);
	
	List<Computer> findByBrandStartingWith(String prefix);
	List<Computer> findByBrandEndingWith(String suffix);
	List<Computer> findByBrand(String Brand);


	
}