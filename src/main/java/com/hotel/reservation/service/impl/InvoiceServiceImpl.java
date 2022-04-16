package com.hotel.reservation.service.impl;

import com.hotel.reservation.entity.Invoice;
import com.hotel.reservation.repository.InvoiceRepository;
import com.hotel.reservation.service.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl extends BaseServiceImpl<Invoice, Integer, InvoiceRepository> implements InvoiceService {
    public InvoiceServiceImpl(InvoiceRepository repository) {
        super(repository);
    }
}
