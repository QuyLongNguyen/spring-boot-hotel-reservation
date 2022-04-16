package com.hotel.reservation.service.impl;

import com.hotel.reservation.entity.Room;
import com.hotel.reservation.repository.RoomRepository;
import com.hotel.reservation.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends BaseServiceImpl<Room, String, RoomRepository> implements RoomService {
    public RoomServiceImpl(RoomRepository repository) {
        super(repository);
    }
}
