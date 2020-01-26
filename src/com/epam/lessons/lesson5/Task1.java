package com.epam.lessons.lesson5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] result = new int[5];

        fillArrays(arr1, arr2);

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        System.out.println("result = " + Arrays.toString(result));
    }

    public static void fillArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
            arr2[i] = (int) (Math.random() * 100);
        }
    }
}
