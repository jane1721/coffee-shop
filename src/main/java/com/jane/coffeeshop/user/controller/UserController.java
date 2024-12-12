package com.jane.coffeeshop.user.controller;

import com.jane.coffeeshop.user.dto.UserPointReq;
import com.jane.coffeeshop.user.dto.UserPointRes;
import com.jane.coffeeshop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/user")
@RestController
public class UserController {

    private final UserService userService;

    // 유저 포인트 충전
    @PostMapping("{userId}/point")
    public ResponseEntity<UserPointRes> chargePoint(@PathVariable Long userId, @RequestBody UserPointReq userPointReq) {

        UserPointRes userPointRes = userService.chargePoint(userId, userPointReq);

        return ResponseEntity.ok(userPointRes);
    }
}
