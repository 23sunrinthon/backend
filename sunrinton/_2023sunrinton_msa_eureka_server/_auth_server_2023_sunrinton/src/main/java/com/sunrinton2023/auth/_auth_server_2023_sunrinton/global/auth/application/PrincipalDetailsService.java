package com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.application;


import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dao.UserRepository;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.domain.UserLoginEntity;
import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dto.UserLoginEntityUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class PrincipalDetailsService implements UserDetailsService {

    private final UserRepository userAuthRepository;

    @Autowired
    public PrincipalDetailsService(UserRepository userAuthRepository) {
        this.userAuthRepository = userAuthRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserLoginEntity> userLoginEntity = userAuthRepository.findByUserLoginUsername(username);
        if (userLoginEntity.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }
        return new UserLoginEntityUserDetails(userLoginEntity.get());
    }
}