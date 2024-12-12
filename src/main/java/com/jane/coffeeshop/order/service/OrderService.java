package com.jane.coffeeshop.order.service;

import com.jane.coffeeshop.order.dto.OrderReq;
import com.jane.coffeeshop.order.dto.OrderResultRes;

public interface OrderService {

    OrderResultRes orderCoffee(OrderReq orderReq);
}
