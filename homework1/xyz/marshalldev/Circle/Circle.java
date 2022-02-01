package xyz.marshalldev.Circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getArea() {
        return Math.PI * (radius*radius);
    }

    public double getCircumference() {
        double diameter = radius*2;

        return diameter*Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}