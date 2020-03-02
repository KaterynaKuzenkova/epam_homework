package com.epam.lessons.lesson3;

public class Task1_5 {
    public static void main(String[] args) {

        int row = 1;
        while (row <= 8) {
            int column = 8;
            while (column > 0) {
                if (column > row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                column--;
            }
            int number = 8 + row;
            while (number > 9) {

                System.out.print("* ");
                number--;
            }
            row++;
            System.out.println();
        }
        row = 1;
        while (row <= 8) {
            int column = 8;
            while (column > 0) {
                if (column > row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                column--;
            }
            int number = 8 + row;
            while (number > 9) {

                System.out.print("* ");
                number--;
            }
            row++;
            System.out.println();
        }
    }
}

