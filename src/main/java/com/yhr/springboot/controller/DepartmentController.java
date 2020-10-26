package com.yhr.springboot.controller;

import com.yhr.springboot.model.Department;
import com.yhr.springboot.services.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

    @Autowired
    DepartmentServices departmentServices;

    @PostMapping("/addNewDepartment")
    public Department addDepartment(@Valid @RequestBody Department department){
        return departmentServices.addDepartment(department);
    }
}
