package com.senai.eventsmanager.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TemLetraMaiusculaValidador implements ConstraintValidator<ObrigatorioLetraMaiuscula, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return value.matches(".*[A-Z].*");

}
}
