package com.epam.lessons.lesson7;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + " color = " + this.color + " radius = " + this.radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
