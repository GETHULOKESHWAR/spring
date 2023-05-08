package com.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Models.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, String> {

}
