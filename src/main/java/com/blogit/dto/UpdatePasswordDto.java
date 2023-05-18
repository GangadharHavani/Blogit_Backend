package com.blogit.dto;

import com.blogit.annotation.PasswordRepeatEqual;
import com.blogit.annotation.ValidPassword;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PasswordRepeatEqual(
        passwordFieldFirst = "password",
        passwordFieldSecond = "passwordRepeat"
)
public class UpdatePasswordDto {
    @ValidPassword
    private String password;
    private String passwordRepeat;

    private String oldPassword;
}
