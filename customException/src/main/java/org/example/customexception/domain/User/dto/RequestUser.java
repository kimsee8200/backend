package org.example.customexception.domain.User.dto;

import java.util.Objects;

public record RequestUser(
        String username,
        String password,
        String role
) {
    public RequestUser {
        if(username.equals("admin")){
            username = "dj";
        }
    }
}
