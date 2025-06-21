package com.example.Springbootplay.service;


import com.example.Springbootplay.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public Employee findById(int name);

    public List<Employee> findAllEmployees();

    public void addEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int empId);
}
