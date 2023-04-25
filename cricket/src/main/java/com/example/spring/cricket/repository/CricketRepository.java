package com.example.spring.cricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.cricket.model.Cricket;

@Repository
public interface CricketRepository extends JpaRepository<Cricket, Integer> {

}
