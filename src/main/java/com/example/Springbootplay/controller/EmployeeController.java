package com.example.Springbootplay.controller;


import com.example.Springbootplay.model.Employee;
import com.example.Springbootplay.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/find/{name}")
    public Employee findEmployee(@PathVariable String name) {
        return employeeService.findByName(name);
    }
}
