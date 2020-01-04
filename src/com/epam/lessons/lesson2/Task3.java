package com.epam.lessons.lesson2;

public class Task3 {
    public static void main(String[] args) {

        double sumOfDeposit = 20000;
        double annualPercentage = 0.11;
        double investmentPeriod = 180;
        double profitAmount = (sumOfDeposit * annualPercentage * investmentPeriod) / 365 ;
        System.out.println(profitAmount);

    }
}
