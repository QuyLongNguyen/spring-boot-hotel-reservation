package com.hotel.reservation.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.Optional;

public interface BaseService<T, ID extends Serializable> {
    Iterable<T> findAll(Sort sort);

    Page<T> findAll(Pageable pageable);

    <S extends T> S save(S entity);

    Optional<T> findById(ID id);

    Iterable<T> findAll();

    long count();

    void deleteById(ID id);

    void deleteAll();
}
