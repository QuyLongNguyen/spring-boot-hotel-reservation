package com.hotel.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class HotelReservationApplication {

    @Autowired
    EntityManager sessionFactory;

    public static void main(String[] args) {
        SpringApplication.run(HotelReservationApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return cmd -> System.out.println(sessionFactory);
    }

}
