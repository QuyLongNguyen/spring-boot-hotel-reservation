package com.hotel.reservation.entity;

import com.hotel.reservation.enums.RoomStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private RoomType roomType;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    @OneToMany(mappedBy = "room")
    private List<BookingRequest> bookingRequests;

}
