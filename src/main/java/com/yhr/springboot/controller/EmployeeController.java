package com.yhr.springboot.controller;

import com.yhr.springboot.model.Employee;
import com.yhr.springboot.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    EmployeeServices employeeServices;

    @PostMapping("/{teamId}/addNewEmployee")
    public Optional<Employee> addEmployee(@Valid @RequestBody Employee employee, @PathVariable Short teamId) {
        return employeeServices.addEmployee(employee, teamId);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeServices.allEmployee();
    }

}
