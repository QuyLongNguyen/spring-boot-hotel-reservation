package com.hotel.reservation.service.impl;

import com.hotel.reservation.entity.Guest;
import com.hotel.reservation.repository.GuestRepository;
import com.hotel.reservation.service.GuestService;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImpl extends BaseServiceImpl<Guest,Integer, GuestRepository> implements GuestService {
    public GuestServiceImpl(GuestRepository repository) {
        super(repository);
    }
}
