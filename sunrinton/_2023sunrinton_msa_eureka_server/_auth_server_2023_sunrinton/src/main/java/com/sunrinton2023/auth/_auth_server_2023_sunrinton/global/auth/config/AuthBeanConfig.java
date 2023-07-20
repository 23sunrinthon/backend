package com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.application.PrincipalDetailsService;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.application.UserAuthServiceImpl;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dao.UserAuthRepositoryImpl;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dao.UserRepository;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.util.JwtUtil;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthBeanConfig {
    @PersistenceContext
    private jakarta.persistence.EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private JwtUtil jwtUtil;
    @Bean
    public UserAuthRepositoryImpl userAuthRepository() {
        return new UserAuthRepositoryImpl(entityManager, userRepository);
    }
    @Bean
    public PrincipalDetailsService principalDetailsService(){
        return new PrincipalDetailsService(userRepository);
    }
    @Bean
    public UserAuthServiceImpl userAuthService() {
        return new UserAuthServiceImpl(userAuthRepository(), principalDetailsService(), objectMapper, jwtUtil, userRepository);
    }
}
