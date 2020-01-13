package com.epam.lessons.lesson3;

public class Task1_1 {
    public static void main(String[] args) {

        int line = 1;
        while (line <= 8) {
            int number = line;
            while (number > 0) {

                System.out.print("* ");
                number--;
            }
            line++;
            System.out.println();
        }

        line = 1;
        while (line <= 7) {
            int number = 8 - line;
            while (number > 0) {

                System.out.print("* ");
                number--;
            }
            line++;
            System.out.println();
        }
    }
}


