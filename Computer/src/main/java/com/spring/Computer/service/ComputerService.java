package com.spring.Computer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.spring.Computer.dao.ComputerRepository;
import com.spring.Computer.model.Computer;

import jakarta.transaction.Transactional;






@Service
public class ComputerService {
@Autowired
	ComputerRepository comRepository;
	public List <Computer> getAllDetails(){
		List<Computer>comList=comRepository.findAll();
		return comList;
	}
	public Computer saveComputers(Computer s) {
		Computer obj=comRepository.save(s);
		return obj;
		//return studRepository.save(S);
	}
	public Computer updateComputer(Computer s)
	{
		Computer obj=comRepository.save(s);
		return obj;
	}
	public void deleteComputer(int sNo)
	{
		comRepository.deleteById(sNo);
	}
	public Computer getComputer(int sNo)
	{
		Computer s=comRepository.findById(sNo).get();
		return s;
	}
	
	public List<Computer> sortComputer(String field) {
		//return lapRepository.findAll(Sort.by(field)); //to return the table data in ascending order
		return comRepository.findAll(Sort.by(Direction.DESC,field));
	}
	public List<Computer>PagingComputer(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset, pageSize);
		Page<Computer>comData=comRepository.findAll(paging);
		List<Computer>comList=comData.getContent();
		return  comList;
	}
	

	
	public List<Computer>pagingSortingComputer(int offset,int pageSize,String field){
		
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Computer>comData= comRepository.findAll(paging);	
		List<Computer>comList=comData.getContent();
		return comList;
	}
	
	public List<Computer>getComputerByBrand(String brand) {
		List<Computer> comList=comRepository.getComputerByBrand(brand);
		return comList;
	}
	@Transactional
	public int deleteComputerByBrand(String brand) {
		return comRepository.deleteComputerByBrand(brand);
	}
	
	@Transactional
	public int UpdateComputerByBrand(String brand,String price) {
		return comRepository.UpdateComputerByBrand(brand,price);
	}

	

}