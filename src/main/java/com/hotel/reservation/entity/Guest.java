package com.hotel.reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "citizen_id")
    private String citizenId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private LocalDate dob;

    @OneToMany(mappedBy = "guest")
    private List<BookingRequest> bookingRequests;
}
