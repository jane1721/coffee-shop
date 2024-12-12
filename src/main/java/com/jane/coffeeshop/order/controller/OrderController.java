package com.jane.coffeeshop.order.controller;

import com.jane.coffeeshop.order.dto.OrderReq;
import com.jane.coffeeshop.order.dto.OrderResultRes;
import com.jane.coffeeshop.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/order")
@RestController
public class OrderController {

    private final OrderService orderService;

    // 커피 주문/결제
    @PostMapping
    public ResponseEntity<OrderResultRes> chargePoint(@RequestBody OrderReq orderReq) {

        OrderResultRes orderResultRes = orderService.orderCoffee(orderReq);

        return ResponseEntity.ok(orderResultRes);
    }
}
