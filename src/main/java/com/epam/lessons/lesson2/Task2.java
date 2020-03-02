package com.epam.lessons.lesson2;

public class Task2 {
    public static void main(String[] args) {
        int kilos;
        int grams;
        double kilosAndGrams = convertPoundsToKilos(67.5);
        kilos = (int) kilosAndGrams;
        grams = (int) ((kilosAndGrams - kilos) * 1000);
        System.out.println(kilos);
        System.out.println(grams);
    }

    public static double convertPoundsToKilos(double pounds) {

        return (pounds * 453.6 / 1000);
    }

}
