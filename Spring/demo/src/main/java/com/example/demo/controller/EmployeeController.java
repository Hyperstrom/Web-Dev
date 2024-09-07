package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.services.Employee_service;

import java.time.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



//Operations 
// Get the Employee
//Post the Employee
//Delete the Employee

@RestController // this is a anotation to make the class controller 
@RequestMapping(path = "/employees")

public class EmployeeController {

    private final Employee_service employee_service;

    public EmployeeController(Employee_service employee_service){
        this.employee_service = employee_service;
    }
    
    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeesById(@PathVariable("id") Long employeeid) {
        return employee_service.gEmployeeByID(employeeid);
    } 
    
    @PostMapping 
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employee_service.createNewEmployee(employeeDTO);
    }
    
}
