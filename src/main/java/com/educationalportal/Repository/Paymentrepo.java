package com.educationalportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalportal.Entity.PaymentEntity;

public interface Paymentrepo extends JpaRepository<PaymentEntity,Long> {

}
