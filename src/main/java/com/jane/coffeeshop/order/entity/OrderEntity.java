package com.jane.coffeeshop.order.entity;

import com.jane.coffeeshop.coffeemenu.entity.CoffeeMenuEntity;
import com.jane.coffeeshop.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "shop_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false)
    private CoffeeMenuEntity coffeeMenuEntity;

    @Column(nullable = false)
    private int price;
}
