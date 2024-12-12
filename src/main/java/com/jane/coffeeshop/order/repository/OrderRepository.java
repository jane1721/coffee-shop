package com.jane.coffeeshop.order.repository;

import com.jane.coffeeshop.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
