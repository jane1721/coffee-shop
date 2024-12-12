package com.jane.coffeeshop.coffeemenu.controller;

import com.jane.coffeeshop.coffeemenu.dto.CoffeeMenuRes;
import com.jane.coffeeshop.coffeemenu.service.CoffeeMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/coffee-menu")
@RestController
public class CoffeeMenuController {

    private final CoffeeMenuService coffeeMenuService;

    @GetMapping
    public ResponseEntity<List<CoffeeMenuRes>> findAll() {

        List<CoffeeMenuRes> coffeeMenuResList = coffeeMenuService.findAll();

        return ResponseEntity.ok(coffeeMenuResList);
    }
}
