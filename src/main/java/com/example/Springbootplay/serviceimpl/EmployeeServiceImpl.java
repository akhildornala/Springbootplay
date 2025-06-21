package com.example.Springbootplay.serviceimpl;

import com.example.Springbootplay.exception.EmployeeNotFoundException;
import com.example.Springbootplay.model.Employee;
import com.example.Springbootplay.repository.EmployeeRepository;
import com.example.Springbootplay.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    public List<Employee> findAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        Comparator<Employee> comp = (o1, o2) -> o1.getName().compareTo(o2.getName());
        employees.sort(comp);
        return employees;
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        Employee empExisting = employeeRepository.findByName(employee.getName());
        if (empExisting == null) {
            throw new EmployeeNotFoundException("Employee not found to update with name:" + employee.getName());
        }
        BeanUtils.copyProperties(employee, empExisting);
        employeeRepository.save(empExisting);
    }


}
