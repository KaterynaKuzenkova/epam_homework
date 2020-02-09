package lesson7;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + " color = " + this.color + " a = " +
                this.a + " b = " + this.b + " c = " + this.c;
    }

    @Override
    public double calcArea() {
        final double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
