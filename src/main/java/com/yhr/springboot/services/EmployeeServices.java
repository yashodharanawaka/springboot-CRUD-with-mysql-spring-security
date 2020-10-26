package com.yhr.springboot.services;

import com.yhr.springboot.model.Employee;
import com.yhr.springboot.repository.EmployeeRepository;
import com.yhr.springboot.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Optional<Employee> addEmployee(Employee employee, Short teamId) {
        return teamRepository.findById(teamId).map(team->{
            employee.setTeam(team);
            System.out.println(employee.getPassword());
            employee.setPassword(passwordEncoder.encode(employee.getPassword()));
            System.out.println(employee.getPassword());
            return employeeRepository.save(employee);
        });
    }
    public List<Employee> allEmployee(){
        return employeeRepository.findAll();
    }

}
