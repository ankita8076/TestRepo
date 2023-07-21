package com.example.newProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newProject.Entity.Customer;

@Repository

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
