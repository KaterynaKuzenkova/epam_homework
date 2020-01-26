package com.epam.lessons.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter your array number");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        fillArray(array);

        System.out.println("array = " + Arrays.toString(array));
        int[][] result = splitArray(array);
        System.out.println("result: ");
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }

    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
    }

    public static int[][] splitArray(int[] array) {
        int[][] result = new int[2][0];
        int countPositive = 1;
        int countNegative = 1;

        for (int value : array) {
            if (value > 0) {
                result[0] = Arrays.copyOf(result[0], countPositive);
                result[0][countPositive - 1] = value;
                countPositive++;
            } else {
                result[1] = Arrays.copyOf(result[1], countNegative);
                result[1][countNegative - 1] = value;
                countNegative++;
            }
        }

        return result;
    }
}
