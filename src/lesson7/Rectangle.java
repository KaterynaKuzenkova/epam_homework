package lesson7;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + " color = " + this.color + " width = " +
                this.width + " height = " + this.height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }


}
