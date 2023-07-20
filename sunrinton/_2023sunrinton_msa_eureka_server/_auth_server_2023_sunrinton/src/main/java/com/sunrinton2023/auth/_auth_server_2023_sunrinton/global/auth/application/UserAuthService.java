package com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.application;

import ch.qos.logback.core.util.OptionHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.domain.UserLoginEntity;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dto.UserLoginData;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.util.Optional;


public interface UserAuthService {
    String login(UserLoginData userLoginData, HttpServletRequest httpServletRequest) throws JsonProcessingException;
    Optional<UserLoginEntity> signin(UserLoginData userLoginData);

}