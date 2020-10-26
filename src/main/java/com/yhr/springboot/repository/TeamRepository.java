package com.yhr.springboot.repository;

import com.yhr.springboot.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Short> {
}
