package com.microservicesdemo.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesdemo.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
