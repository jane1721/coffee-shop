package com.jane.coffeeshop.order.dto;

import lombok.Data;

@Data
public class OrderReq {
    Long userId;
    Long menuId;
}
