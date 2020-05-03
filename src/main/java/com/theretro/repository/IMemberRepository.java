package com.theretro.repository;

import com.theretro.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMemberRepository extends JpaRepository<Member, String> {
    Member findByUserName(String username);
}
