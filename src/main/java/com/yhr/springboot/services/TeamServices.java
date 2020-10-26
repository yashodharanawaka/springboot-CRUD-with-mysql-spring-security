package com.yhr.springboot.services;

import com.yhr.springboot.model.Team;
import com.yhr.springboot.repository.DepartmentRepository;
import com.yhr.springboot.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamServices {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public Optional<Team> addTeam(Team team, Short departmentId) {
        return departmentRepository.findById(departmentId).map(department->{
            team.setDepartment(department);
        return teamRepository.save(team);
        });
    }
}
