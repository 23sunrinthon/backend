package com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dao;

import ch.qos.logback.core.util.OptionHelper;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.domain.UserLoginEntity;


import java.util.Optional;

public interface UserAuthRepository {
    Optional<UserLoginEntity> findByEmail(String email);
}
