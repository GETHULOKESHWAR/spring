package com.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Models.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
