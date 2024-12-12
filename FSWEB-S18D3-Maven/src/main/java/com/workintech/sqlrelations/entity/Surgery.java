package com.workintech.sqlrelations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Surgery {
    private long id;

    private long nurseId;

    private long patientId;

    private long doctorId;
}
