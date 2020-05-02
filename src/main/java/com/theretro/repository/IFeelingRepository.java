package com.theretro.repository;

import com.theretro.domain.Feeling;
import com.theretro.domain.enums.FeelingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFeelingRepository extends JpaRepository<Feeling, String> {
    List<Feeling> findByType(FeelingType type);
}
