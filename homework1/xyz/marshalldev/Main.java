package xyz.marshalldev;

import xyz.marshalldev.Circle.TestCircle;
import xyz.marshalldev.Employee.TestEmployee;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double radius = getRadius();

        while (!checkRadiusBound(radius)) {
            radius = getRadius();
        }

        new TestCircle(radius);
        new TestEmployee();
    }

    private static double getRadius() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius for the circle: ");
        return scan.nextDouble();
    }

    private static boolean checkRadiusBound(double radius) {
        if (radius > 0 && radius < 50) {
            return true;
        } else {
            System.out.println("Radius must be between 1 and 49.");
        }
        return false;
    }
}
