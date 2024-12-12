package com.workintech.sqlrelations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {
    private long id;
    private String name;
    private String surname;
    private String proficiency;
}
