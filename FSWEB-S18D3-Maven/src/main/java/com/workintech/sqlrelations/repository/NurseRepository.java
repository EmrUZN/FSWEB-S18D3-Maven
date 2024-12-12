package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class NurseRepository extends JpaRepository<Nurse, Long> {
    public void save(Nurse nurse) {
    }

    public List<Nurse> findAll() {
    }
}
