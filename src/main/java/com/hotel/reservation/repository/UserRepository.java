package com.hotel.reservation.repository;

import com.hotel.reservation.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User, Integer> {

    Optional<User> findUserByName(String name);

    Optional<User> findUserByCitizenId(String citizenId);

}
