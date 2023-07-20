package com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dao;

import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.domain.UserLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserLoginEntity, UUID>{
    Optional<UserLoginEntity> findByUserLoginUsername(String userLoginUsername);
}
