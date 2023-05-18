package com.blogit.dto;

import lombok.*;

import javax.validation.constraints.Size;

import com.blogit.annotation.PasswordRepeatEqual;
import com.blogit.annotation.ValidEmail;
import com.blogit.annotation.ValidPassword;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PasswordRepeatEqual(
        passwordFieldFirst = "password",
        passwordFieldSecond = "passwordRepeat"
)
public class SignupDto {
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;
    private String passwordRepeat;

    @Size(max = 64)
    private String firstName;

    @Size(max = 64)
    private String lastName;
}
