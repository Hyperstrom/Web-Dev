package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee_Entity;
//Persestance layer 
@Repository
public interface Employee_repo extends JpaRepository<Employee_Entity, Long>{
}
