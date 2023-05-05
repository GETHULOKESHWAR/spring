package com.spring.Computer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Computer.model.UserDetails;
import com.spring.Computer.service.UserService;

//import io.swagger.v3.oas.annotations.Operation;




@RestController
public class UserController {
	


	    @Autowired
		UserService userServ;
	    
	    @GetMapping("/checklogin")
	    public String login(@RequestParam String user,@RequestParam String password)
	    {
	    	return userServ.login(user,password);
	    }
	    
	    @PostMapping("/register")
	    public UserDetails register(@RequestBody UserDetails user) 
	    {
	    	return userServ.register(user);
	    }
}