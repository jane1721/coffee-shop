package com.jane.coffeeshop.coffeemenu.entity;

import com.jane.coffeeshop.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "coffee_menu")
public class CoffeeMenuEntity extends BaseEntity {
    @Id
    private Long menuId;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private int price;
}
