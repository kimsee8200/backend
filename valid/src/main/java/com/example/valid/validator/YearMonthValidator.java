package com.example.valid.validator;

import com.example.valid.annotation.PhoneNumber;
import com.example.valid.annotation.YearMonth;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class YearMonthValidator implements ConstraintValidator<YearMonth,String> {
    private String regexp;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        this.regexp = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {

        var reValue = s+"01";
        var rePattern = regexp+"dd";
        try {
            LocalDate date = LocalDate.parse(reValue, DateTimeFormatter.ofPattern(rePattern));

            return true;
        } catch (Exception e){
            return true;
        }
    }
}
