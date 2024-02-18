package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CarDAO;
import com.app.dto.CarDTO;
import com.app.entities.Car;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Autowired
    private ModelMapper modelMapper;

    public List<CarDTO> getAllCars() {
        List<Car> cars = carDAO.findAll();
        return cars.stream()
                .map(car -> modelMapper.map(car, CarDTO.class))
                .collect(Collectors.toList());
    }

	@Override
	public CarDTO createCar(CarDTO carDTO) {
        Car car = modelMapper.map(carDTO, Car.class);
        Car savedCar = carDAO.save(car);
        return modelMapper.map(savedCar, CarDTO.class);
    }

	@Override
	public CarDTO getCarById(Long id) {
        Car car = carDAO.findById(id)
                .orElseThrow();
        return modelMapper.map(car, CarDTO.class);
    }

	 public CarDTO updateCar(Long id, CarDTO carDTO) {
	        if (!carDAO.existsById(id)) {
	           System.out.println("car not found");
	        }

	        Car car = modelMapper.map(carDTO, Car.class);
	        car.setId(id);
	        Car updatedCar = carDAO.save(car);
	        return modelMapper.map(updatedCar, CarDTO.class);
	    }

	    public void deleteCar(Long id) {
	        if (!carDAO.existsById(id)) {
	        	  System.out.println("car not found");
	        }
	        carDAO.deleteById(id);
	    }
	
}
