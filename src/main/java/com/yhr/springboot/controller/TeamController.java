package com.yhr.springboot.controller;

import com.yhr.springboot.model.Team;
import com.yhr.springboot.services.TeamServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("api/teams")

public class TeamController {

    @Autowired
    TeamServices teamServices;

    @PostMapping("/{departmentId}/addNewTeam")
    public Optional<Team> addTeam(@Valid @RequestBody Team team, @PathVariable Short departmentId) {
        return teamServices.addTeam(team,departmentId);
    }
}
