package com.sunrinton2023.auth._auth_server_2023_sunrinton.global.auth.dto;

public class AreadyUsernameResponse {
    private String message;

    public AreadyUsernameResponse(String message) {
        this.message = message;
    }

    public AreadyUsernameResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
