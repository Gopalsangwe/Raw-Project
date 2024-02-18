package com.app.service;

import java.util.List;

import com.app.dto.CarDTO;

public interface CarService {

	List<CarDTO> getAllCars();

	CarDTO createCar(CarDTO carDTO);

	CarDTO getCarById(Long id);

	CarDTO updateCar(Long id, CarDTO carDTO);

	void deleteCar(Long id);

}
