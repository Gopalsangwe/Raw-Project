package com.app.entities;
import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "car_owners")
public class CarOwner extends BaseEntity {

    private String name;
    private String contactInformation;
    private String address;

    @OneToMany(targetEntity = Car.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cc_fk",referencedColumnName = "id")
    private List<Car> cars;


   
}
