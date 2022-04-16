package com.hotel.reservation.repository;

import com.hotel.reservation.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends BaseRepository<Guest, Integer> {
}
