package com.blogit.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.blogit.validator.PasswordRepeatEqualValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordRepeatEqualValidator.class)
public @interface PasswordRepeatEqual {
    String message() default "Password mismatch";
    String passwordFieldFirst();
    String passwordFieldSecond();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}