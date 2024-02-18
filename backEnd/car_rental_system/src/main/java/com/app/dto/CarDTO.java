package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDTO {
    private Long id;
    private String model;
    private String brand;
    private int year;
    private String color;
    private String licensePlate;
    private boolean availability;

    
}