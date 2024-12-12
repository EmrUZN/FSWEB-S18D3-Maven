package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor save(Doctor doctor);

    List<Doctor> findAll();
}
