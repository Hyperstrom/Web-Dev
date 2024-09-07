package com.example.demo.services;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.Employee_Entity;
import com.example.demo.repositories.Employee_repo;

@Service
public class Employee_service {
    
    
    final Employee_repo employee_repo;
    final ModelMapper modelmapper;

    public Employee_service(Employee_repo employee_repo, ModelMapper modelmapper){
        this.employee_repo = employee_repo;
        this.modelmapper = modelmapper;
    }
    public EmployeeDTO gEmployeeByID(Long id){
        Employee_Entity employee_Entity = employee_repo.getById(id);
        return modelmapper.map(employee_Entity, EmployeeDTO.class);

    }
    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) { //DTO to employee Entity
        Employee_Entity employee_Entity = modelmapper.map(employeeDTO, Employee_Entity.class);
        return modelmapper.map(employee_repo.save(employee_Entity),EmployeeDTO.class);
    }
    
}
