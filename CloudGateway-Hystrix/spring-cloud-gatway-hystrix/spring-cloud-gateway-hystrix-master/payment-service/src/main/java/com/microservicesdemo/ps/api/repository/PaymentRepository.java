package com.microservicesdemo.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesdemo.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

