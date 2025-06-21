package com.example.Springbootplay.service;


import com.example.Springbootplay.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    public Employee findByName(String name);
}
