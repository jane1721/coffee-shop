package com.jane.coffeeshop.user.repository;

import com.jane.coffeeshop.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
