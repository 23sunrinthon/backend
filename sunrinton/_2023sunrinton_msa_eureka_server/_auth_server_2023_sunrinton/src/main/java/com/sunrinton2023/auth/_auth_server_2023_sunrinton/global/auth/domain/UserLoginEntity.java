package com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.domain;


import com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dto.UserLoginData;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

@Entity
public class UserLoginEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID uuid;
    @Column(unique = true, nullable = false, length = 50)
    private String userLoginUsername;
    @Column(nullable = false, length = 9999999)
    private String userLoginPassword;
    @Builder
    public UserLoginEntity(String userLoginUsername, String userLoginPassword) {
        this.userLoginUsername = userLoginUsername;
        this.userLoginPassword = userLoginPassword;
    }
    @Builder
    public UserLoginEntity(UserLoginData accountReqDto) {
        this.userLoginUsername = accountReqDto.getUserLoginEmail();
        this.userLoginPassword = accountReqDto.getUserLoginPassword();
    }

    public UserLoginEntity() {
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUserLoginEmail() {
        return userLoginUsername;
    }

    public void setUserLoginEmail(String userLoginEmail) {
        this.userLoginUsername = userLoginEmail;
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword;
    }

    @Override
    public String toString() {
        return "UserLoginEntity{" +
                "uuid=" + uuid +
                ", userLoginEmail='" + userLoginUsername + '\'' +
                ", userLoginPassword='" + userLoginPassword + '\'' +
                '}';
    }
}
