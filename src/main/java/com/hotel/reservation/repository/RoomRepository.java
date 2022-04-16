package com.hotel.reservation.repository;

import com.hotel.reservation.entity.Room;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends BaseRepository<Room, String> {

}
