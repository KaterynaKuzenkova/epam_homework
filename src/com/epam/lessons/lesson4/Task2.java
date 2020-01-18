package com.epam.lessons.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter your int number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(intToBinary(number));
    }

    public static String intToBinary(int n) {
        String result = "";
        while (n > 0) {
            result = ((n % 2) == 0 ? "0" : "1") + result;
            n = n / 2;
        }
        return result;
    }
}
