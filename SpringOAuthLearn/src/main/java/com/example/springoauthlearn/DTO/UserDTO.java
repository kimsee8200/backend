package com.example.springoauthlearn.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
public record UserDTO (
     String role,
     String name,
     String username
){}
