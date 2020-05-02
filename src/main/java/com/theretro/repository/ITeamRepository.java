package com.theretro.repository;

import com.theretro.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamRepository extends JpaRepository<Team, String> {
    Team finByTeamName(String teamName);
}
