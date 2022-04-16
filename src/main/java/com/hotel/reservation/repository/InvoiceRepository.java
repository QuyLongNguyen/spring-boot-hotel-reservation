package com.hotel.reservation.repository;

import com.hotel.reservation.entity.Invoice;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends BaseRepository<Invoice, Integer> {
}
