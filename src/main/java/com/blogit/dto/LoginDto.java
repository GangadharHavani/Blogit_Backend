package com.blogit.dto;

import com.blogit.annotation.ValidEmail;
import com.blogit.annotation.ValidPassword;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;
}
