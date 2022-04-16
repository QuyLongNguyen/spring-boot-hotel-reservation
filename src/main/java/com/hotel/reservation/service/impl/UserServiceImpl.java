package com.hotel.reservation.service.impl;

import com.hotel.reservation.entity.User;
import com.hotel.reservation.repository.UserRepository;
import com.hotel.reservation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
