package com.jane.coffeeshop.coffeemenu.service;

import com.jane.coffeeshop.coffeemenu.dto.CoffeeMenuRes;

import java.util.List;

public interface CoffeeMenuService {

    List<CoffeeMenuRes> findAll();
}
