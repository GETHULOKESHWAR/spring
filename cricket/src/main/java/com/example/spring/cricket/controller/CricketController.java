package com.example.spring.cricket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.cricket.model.Cricket;
import com.example.spring.cricket.service.CricketService;

@RestController
@RequestMapping("/api")
public class CricketController {
	@Autowired
	private CricketService service;
	@GetMapping()
	public List<Cricket> read(){
		return service.getCricket();
	}
	@GetMapping("/{id}")
	public Optional<Cricket> readbyId(@PathVariable int id) {
		return service.getCricketbyId(id);
	}
	@PostMapping
	public Cricket create(@RequestBody Cricket Cricket) {
		return service.addCricket(Cricket);
	}
	@PutMapping("/{id}")
	public Cricket update(@RequestBody Cricket Cricket, @PathVariable int id) {
		return service.editCricket(Cricket, id);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteCricket(id);
	}
}
