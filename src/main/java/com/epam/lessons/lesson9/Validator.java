package com.epam.lessons.lesson9;

import javax.xml.bind.ValidationException;

public class Validator {

    public static void validateDoubleNumber(String number) throws ValidationException {
        try {
            double parsedNumber = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new ValidationException("Input is not number");
        }
    }

    public static void validateNaturalNumber(double number) throws ValidationException {
        if (number <= 0) {
            throw new ValidationException("Is not natural number");
        }
    }

    public static void validateEmptyString(String str) throws ValidationException {
        if(str == null || str.trim().isEmpty()) {
            throw new ValidationException("Input string is empty");
        }
    }
}