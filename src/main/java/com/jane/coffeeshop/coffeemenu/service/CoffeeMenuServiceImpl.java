package com.jane.coffeeshop.coffeemenu.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jane.coffeeshop.coffeemenu.dto.CoffeeMenuRes;
import com.jane.coffeeshop.coffeemenu.entity.CoffeeMenuEntity;
import com.jane.coffeeshop.coffeemenu.repository.CoffeeMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CoffeeMenuServiceImpl implements CoffeeMenuService {

    private final CoffeeMenuRepository coffeeMenuRepository;
    private final ObjectMapper objectMapper;

    @Override
    public List<CoffeeMenuRes> findAll() {

        List<CoffeeMenuEntity> coffeeMenuEntityList = coffeeMenuRepository.findAll();

        return coffeeMenuEntityList.stream().map(coffeeMenuEntity -> objectMapper.convertValue(coffeeMenuEntity, CoffeeMenuRes.class)).toList();
    }
}
