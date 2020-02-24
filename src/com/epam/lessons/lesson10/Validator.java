package com.epam.lessons.lesson10;

public class Validator {

    public static void validateDoubleNumber(String number) {
        try {
            double parsedNumber = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new ValidationException("Input is not number");
        }
    }

    public static void validateNaturalNumber(double number) {
        if (number <= 0) {
            throw new ValidationException("Is not natural number");
        }
    }

    public static void validateEmptyString(String str) {
       if(str == null || str.trim().isEmpty()) {
           throw new ValidationException("Input string is empty");
       }
    }
}