package com.example.Springbootplay.controller;


import com.example.Springbootplay.model.Employee;
import com.example.Springbootplay.service.EmployeeService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "tag_at_class_level", description = "Employee related class level tag")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @Tag(name = "find employee")
    @Tag(name = "findEmployee_tag_at_method_level")
    @Tag(name = "findEmployee")
    @GetMapping("/find/{empId}")
    public Employee findEmployee(@PathVariable int empId) {
        return employeeService.findById(empId);
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


    @DeleteMapping("/delete/{empId}")
    public void deleteEmployee(@PathVariable int empId) {
        employeeService.deleteEmployee(empId);
    }

}
