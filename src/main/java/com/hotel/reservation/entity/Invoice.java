package com.hotel.reservation.entity;

import com.hotel.reservation.enums.RoomTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String roomId;

    private String citizenId;

    private String guestName;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private RoomTypeEnum roomType;

    private BigDecimal unitPrice;

    private LocalDate startDate;

    private LocalDate endDate;

    private BigDecimal totalPrice;
}
