package com.spring.Computer.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Computer.dao.BrandDetailsRepository;
import com.spring.Computer.model.BrandDetails;





@Service
public class BrandDetailsService {


		@Autowired
		BrandDetailsRepository brandRepo;
		
		public List<BrandDetails> fetchAllDetails() {
		// TODO Auto-generated method stub
		return brandRepo.findAll();
	}
	public BrandDetails postDetails(BrandDetails p) {
		// TODO Auto-generated method stub
		return brandRepo.save(p);
	}
}
