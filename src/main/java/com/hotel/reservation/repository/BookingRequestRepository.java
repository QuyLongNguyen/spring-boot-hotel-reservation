package com.hotel.reservation.repository;

import com.hotel.reservation.entity.BookingRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRequestRepository extends BaseRepository<BookingRequest, Integer> {
}
