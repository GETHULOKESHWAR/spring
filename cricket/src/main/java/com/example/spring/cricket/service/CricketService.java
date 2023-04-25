package com.example.spring.cricket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.cricket.model.Cricket;
import com.example.spring.cricket.repository.CricketRepository;

@Service
public class CricketService {
	@Autowired
	private CricketRepository repository;
	
	public List<Cricket>getCricket(){
		return repository.findAll();
	}
	public Optional<Cricket> getCricketbyId(int id) {
		return repository.findById(id);
	}
	public Cricket addCricket(Cricket Cricket) {
		return repository.save(Cricket);
	}
	public Cricket editCricket (Cricket cricket,int id) {
		Cricket Cricket=repository.findById(id).orElse(null);
		if(Cricket!=null) {
			Cricket.setName(Cricket.getName());
			Cricket.setRuns(Cricket.getRuns());
			Cricket.setStrikeRate(Cricket.getStrikeRate());
			return repository.saveAndFlush(Cricket);
		}
		else
		{
			return null;
		}
	}
	public String deleteCricket(int id) {
		repository.deleteById(id);
		return "deleted !";
	}
}
