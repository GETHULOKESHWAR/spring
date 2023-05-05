package com.spring.Computer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Computer.model.UserDetails;



public interface UserRepository extends JpaRepository<UserDetails,Integer>{
}