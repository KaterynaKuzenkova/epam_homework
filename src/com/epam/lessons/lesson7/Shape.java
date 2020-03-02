package com.epam.lessons.lesson7;

public abstract class Shape implements Drawable {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + " color = " + this.color;
    }

    public abstract double calcArea();

}
