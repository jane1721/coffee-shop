package com.jane.coffeeshop.user.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserPointRes {

    private int currentPoints;
}
