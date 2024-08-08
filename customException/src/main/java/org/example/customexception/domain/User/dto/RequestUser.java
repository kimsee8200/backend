package org.example.customexception.domain.User.dto;

import java.util.Objects;

public record RequestUser(
        String username,
        String password
) {
}
