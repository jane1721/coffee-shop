package com.jane.coffeeshop.user.service;

import com.jane.coffeeshop.user.dto.UserPointReq;
import com.jane.coffeeshop.user.dto.UserPointRes;

public interface UserService {

    UserPointRes chargePoint(Long userId, UserPointReq userPointReq);
}
