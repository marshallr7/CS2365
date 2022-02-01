package xyz.marshalldev.Circle;

import java.text.DecimalFormat;

public class TestCircle {

    public TestCircle(double radius) {
        Circle circle = new Circle(radius);
        DecimalFormat decimal = new DecimalFormat("###.##");
        System.out.println("Circle area: " + decimal.format(circle.getArea()));
        System.out.println("Circle circumference: " + decimal.format(circle.getCircumference()));
    }
}
