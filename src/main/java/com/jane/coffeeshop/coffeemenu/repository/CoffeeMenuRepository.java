package com.jane.coffeeshop.coffeemenu.repository;

import com.jane.coffeeshop.coffeemenu.entity.CoffeeMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeMenuRepository extends JpaRepository<CoffeeMenuEntity, Long> {
}
