package com.app.entities;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "admins")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Admin extends BaseEntity {


    private String username;
    private String password;
    private String name;
    private String contactInformation;

    
    
    @OneToMany(targetEntity = Car.class,cascade = CascadeType.ALL)
    private List<Car> managedCars;

    @OneToMany(targetEntity = CarOwner.class,cascade = CascadeType.ALL)
    private List<CarOwner> managedCarOwners;

    @OneToMany(targetEntity = User.class,cascade = CascadeType.ALL)
    private List<User> managedUsers;

    @OneToMany(targetEntity = Reservation.class,cascade = CascadeType.ALL)
    private List<Reservation> managedReservations;


}
