package com.epam.lessons.lesson4;

import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(getUniqueChars(line));
    }

    public static String getUniqueChars(String line) {
        String result = "";
        int i = 0;
        char ch;
        while (i < line.length()) {
            ch = line.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
            i++;
        }
        return result;
    }
}

