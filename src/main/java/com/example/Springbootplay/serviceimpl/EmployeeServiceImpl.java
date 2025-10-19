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
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    public Employee findById(int empId) {
        Employee e = employeeRepository.findByEmpId(empId);
        if (e != null) {
            return e;
        }
        throw new EmployeeNotFoundException("employee not found with empId:" + empId);

    }

    public List<Employee> findAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        Comparator<Employee> comp = (o1, o2) -> o1.getEmpId() - o2.getEmpId();
        employees.sort(comp);
        return employees;
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        Employee empExisting = employeeRepository.findByEmpId(employee.getEmpId());
        if (empExisting == null) {
            throw new EmployeeNotFoundException("Employee not found to update with name:" + employee.getName());
        }
        BeanUtils.copyProperties(employee, empExisting, "id");
        employeeRepository.save(empExisting);
    }


    public void deleteEmployee(int empId) {
        employeeRepository.deleteByEmpId(empId);
    }



}
