package com.hotel.reservation.entity;

import com.hotel.reservation.enums.Role;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String password;

    private LocalDate dob;

    @Column(name = "citizen_id")
    private String citizenId;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String address;
}
