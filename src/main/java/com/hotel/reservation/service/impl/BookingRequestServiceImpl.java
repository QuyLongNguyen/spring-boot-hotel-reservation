package com.hotel.reservation.service.impl;

import com.hotel.reservation.entity.BookingRequest;
import com.hotel.reservation.repository.BookingRequestRepository;
import com.hotel.reservation.service.BookingRequestService;
import org.springframework.stereotype.Service;

@Service
public class BookingRequestServiceImpl extends BaseServiceImpl<BookingRequest, Integer, BookingRequestRepository>
        implements BookingRequestService {
    public BookingRequestServiceImpl(BookingRequestRepository repository) {
        super(repository);
    }
}
