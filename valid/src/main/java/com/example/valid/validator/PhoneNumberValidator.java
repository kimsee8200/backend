package com.example.valid.validator;

import com.example.valid.annotation.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    private String regexp;

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
       this.regexp = constraintAnnotation.regexp();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {

        boolean result = Pattern.matches(s, regexp);
        return result;
    }
}
