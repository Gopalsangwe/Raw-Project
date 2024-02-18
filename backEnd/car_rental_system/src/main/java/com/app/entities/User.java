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
@Table(name = "users")
public class User extends BaseEntity {
    

    private String username;
    private String password;
    private String name;
    private String contactInfo;
    private String address;

    @OneToMany(targetEntity = Reservation.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ur_fk",referencedColumnName = "id")
    private List<Reservation> reservations;

   
}