package com.example.Springbootplay.controller;


import com.example.Springbootplay.model.Employee;
import com.example.Springbootplay.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/find/{name}")
    public Employee findEmployee(@PathVariable String name) {
        return employeeService.findByName(name);
    }

    @GetMapping("/findAll")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

}
