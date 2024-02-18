package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Car;

public interface CarDAO extends JpaRepository<Car, Long> {

}
