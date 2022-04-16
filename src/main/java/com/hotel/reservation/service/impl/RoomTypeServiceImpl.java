package com.hotel.reservation.service.impl;

import com.hotel.reservation.entity.RoomType;
import com.hotel.reservation.repository.RoomTypeRepository;
import com.hotel.reservation.service.RoomTypeService;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeServiceImpl extends BaseServiceImpl<RoomType,Integer, RoomTypeRepository> implements RoomTypeService {
    public RoomTypeServiceImpl(RoomTypeRepository repository) {
        super(repository);
    }
}
