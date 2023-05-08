package com.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
