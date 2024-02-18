package com.app.entities;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name = "cars")
@ToString
public class Car extends BaseEntity {


    private String model;
    private String brand;
    private int year;
    private String color;
    private String licensePlate;
    private boolean availability;
    
	public Car(String model, String brand, int year, String color, String licensePlate, boolean availability) {
		super();
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.licensePlate = licensePlate;
		this.availability = availability;
	}
	


    
}