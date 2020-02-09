package lesson7;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + " color = " + this.color;
    }

    public double calcArea() {
        return 0.0;
    }
}
