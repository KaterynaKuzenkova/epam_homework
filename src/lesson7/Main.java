package lesson7;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Rectangle("blue", 3, 4),
                new Rectangle("red", 4, 5),
                new Rectangle("orange", 6, 4),
                new Rectangle("green", 8, 4),
                new Circle("white", 12.5),
                new Circle("black", 11),
                new Circle("purple", 15),
                new Triangle("yellow", 3, 4, 2.5),
                new Triangle("grey", 5, 5.5, 7));

        printArray(shapes);
        printArrayWithSquare(shapes);
        double square = calcSquare(shapes);
        System.out.println("Square sum = " + square);
        double trianglesSquare = calcSquareForType(shapes, Triangle.class);
        System.out.println("Triangles square sum = " + trianglesSquare);

    }

    public static void printArray(List<Shape> shapes) {
        for (Shape element : shapes) {
            System.out.println(element);
        }
    }

    public static void printArrayWithSquare(List<Shape> shapes) {
        for (Shape element : shapes) {
            System.out.println(element.toString() + " square = " + element.calcArea());
        }
    }

    public static double calcSquare(List<Shape> shapes) {
        double squareSum = 0;

        for (Shape element : shapes) {
            squareSum = squareSum + element.calcArea();
        }

        return squareSum;
    }

    public static double calcSquareForType(List<Shape> shapes, Class clazz) {
        double squareSum = 0;

        for (Shape element : shapes) {
            if (element.getClass().isAssignableFrom(clazz)) {
                squareSum = squareSum + element.calcArea();
            }
        }

        return squareSum;
    }
}
