package com.example.Springbootplay.serviceimpl;

import com.example.Springbootplay.exception.EmployeeNotFoundException;
import com.example.Springbootplay.model.Employee;
import com.example.Springbootplay.repository.EmployeeRepository;
import com.example.Springbootplay.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    public Employee findByName(String name) {
        Employee e = employeeRepository.findByName(name);
        if (e == null) {
            throw new EmployeeNotFoundException("employee not found with name:" + name);
        }
        return e;
    }


}
