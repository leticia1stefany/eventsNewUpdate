package com.senai.eventsmanager.Validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = TemLetraMaiusculaValidador.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface ObrigatorioLetraMaiuscula {
    String messade () default "A senha deve conter letra maiuscula";

    Class<?> [] groups() default {};
    Class<? extends Payload >[] payload() default {};

}
