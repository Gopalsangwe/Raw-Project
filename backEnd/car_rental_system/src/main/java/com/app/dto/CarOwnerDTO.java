package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarOwnerDTO {
    private Long ownerId;
    private String name;
    private String contactInformation;
    private String address;

    // Constructors, getters, setters
}