package com.claseJuan.numerologia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NameNumerology {
    private String name;
    private String vowels;
    private String consonants;
    private Integer lifeGoalsNumber; //suma de todos
    private Integer internalVibrationNumber; // vocales
    private Integer externalVibrationNumber; // consonantes
}
