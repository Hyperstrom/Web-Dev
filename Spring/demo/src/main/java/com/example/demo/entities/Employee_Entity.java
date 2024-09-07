package com.example.demo.entities;
import java.time.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee_Entity {
    @Id //its make the id as a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // autometically generate the id 
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;
}
