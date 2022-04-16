package com.hotel.reservation.entity;

import lombok.experimental.SuperBuilder;
import org.apache.tomcat.jni.Local;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
@SuperBuilder
public class AuditorAware {

    @CreationTimestamp
    @Column(name = "created_date",updatable = false)
    private LocalDate createdDate;

    @CreationTimestamp
    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "created_by",updatable = false)
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;
}
