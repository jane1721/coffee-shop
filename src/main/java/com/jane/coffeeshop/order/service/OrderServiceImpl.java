package com.jane.coffeeshop.order.service;

import com.jane.coffeeshop.coffeemenu.entity.CoffeeMenuEntity;
import com.jane.coffeeshop.coffeemenu.repository.CoffeeMenuRepository;
import com.jane.coffeeshop.order.dto.OrderReq;
import com.jane.coffeeshop.order.dto.OrderResultRes;
import com.jane.coffeeshop.order.entity.OrderEntity;
import com.jane.coffeeshop.order.repository.OrderRepository;
import com.jane.coffeeshop.user.entity.UserEntity;
import com.jane.coffeeshop.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final CoffeeMenuRepository coffeeMenuRepository;

    @Override
    public OrderResultRes orderCoffee(OrderReq orderReq) {

        OrderEntity orderEntity = new OrderEntity();

        UserEntity userEntity = userRepository.findById(orderReq.getUserId()).orElseThrow();
        CoffeeMenuEntity coffeeMenuEntity = coffeeMenuRepository.findById(orderReq.getMenuId()).orElseThrow();

        orderEntity.setUserEntity(userEntity);
        orderEntity.setCoffeeMenuEntity(coffeeMenuEntity);
        orderEntity.setPrice(coffeeMenuEntity.getPrice());

        // 주문 생성
        orderRepository.save(orderEntity);

        // 결제 처리
        userEntity.setPoint(userEntity.getPoint() - coffeeMenuEntity.getPrice());
        userRepository.save(userEntity);

        OrderResultRes orderResultRes = new OrderResultRes();
        orderResultRes.setRemainingPoints(userEntity.getPoint());

        return orderResultRes;
    }
}
