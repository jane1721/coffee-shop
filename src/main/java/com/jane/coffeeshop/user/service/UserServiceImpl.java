package com.jane.coffeeshop.user.service;

import com.jane.coffeeshop.user.dto.UserPointReq;
import com.jane.coffeeshop.user.dto.UserPointRes;
import com.jane.coffeeshop.user.entity.UserEntity;
import com.jane.coffeeshop.user.repository.UserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserPointRes chargePoint(Long userId, UserPointReq userPointReq) {

        Optional<UserEntity> userEntity = userRepository.findById(userId);

        if (userEntity.isPresent()) {

            UserEntity user = userEntity.get();

            // 포인트 충전
            user.setPoint(user.getPoint() + userPointReq.getChargingPoints());
            userRepository.save(user);

            return UserPointRes.builder().currentPoints(user.getPoint()).build();
        }

        return null;
    }
}
