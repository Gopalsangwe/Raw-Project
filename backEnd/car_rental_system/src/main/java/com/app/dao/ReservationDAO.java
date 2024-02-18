package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Reservation;

public interface ReservationDAO extends JpaRepository<Reservation, Long> {

}
