package com.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Models.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, String> {

}
