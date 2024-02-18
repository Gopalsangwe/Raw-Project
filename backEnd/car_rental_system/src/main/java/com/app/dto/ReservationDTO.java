package com.app.dto;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {
    private Long reservationId;
    private Long carId;
    private Long userId;
    private Date startDate;
    private Date endDate;
    private String pickupLocation;
    private String returnLocation;
    private double totalCost;
    private String status;

    // Constructors, getters, setters
}