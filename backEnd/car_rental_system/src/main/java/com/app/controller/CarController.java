package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CarDTO;
import com.app.service.CarService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/cars")
public class CarController {
	
     @Autowired
	private CarService carService;
	
     @GetMapping
	public List<CarDTO> getAllCars(){
		return carService.getAllCars();
	}
     
     @GetMapping("/{id}")
     public ResponseEntity<CarDTO> getCarById(@PathVariable Long id) {
         CarDTO carDTO = carService.getCarById(id);
         return ResponseEntity.ok(carDTO);
     }
     
     @PostMapping
     public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO carDTO) {
         CarDTO createdCar = carService.createCar(carDTO);
         return ResponseEntity.status(HttpStatus.CREATED).body(createdCar);
     }
     
     @PutMapping("/{id}")
     public ResponseEntity<CarDTO> updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO) {
         CarDTO updatedCar = carService.updateCar(id, carDTO);
         return ResponseEntity.ok(updatedCar);
     }

     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
         carService.deleteCar(id);
         return ResponseEntity.noContent().build();
     }
}
