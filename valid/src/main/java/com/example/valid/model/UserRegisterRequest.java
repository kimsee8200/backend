package com.example.valid.model;

import com.example.valid.annotation.PhoneNumber;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRegisterRequest {

    //@NotBlank
    private String name;

    private String nickname;

    @Size(min = 1, max = 12)
    @NotBlank
    private String password;

    @NotNull
    @Min(1)
    @Max(100)
    private Integer age;

    @Email
    private String email;

    @PhoneNumber
    //@Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "휴대폰 번호 양식이 맞지 않습니다.")
    private String phoneNumber;

    @FutureOrPresent
    private LocalDateTime registerAt;

    @AssertTrue(message = "name or nickName 은 존재해야 합니다.")
    public boolean isNameCheck(){

        if(Objects.nonNull(name) && !name.isBlank()){
            return true;
        }

        if(Objects.nonNull(nickname) && !nickname.isBlank()){
            return true;
        }

        return false;
    }
}
