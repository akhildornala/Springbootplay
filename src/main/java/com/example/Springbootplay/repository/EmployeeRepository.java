package com.example.Springbootplay.repository;

import com.example.Springbootplay.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {


    public Employee findByEmpId(int empId);

    public void deleteByEmpId(int empId);
}
