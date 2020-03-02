package com.epam.lessons.lesson3;

public class Task1_2 {
    public static void main(String[] args) {

        int row = 1;
        while (row <= 8) {
            int column = 1;
            while (column <= 8) {
                if (column >= row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
