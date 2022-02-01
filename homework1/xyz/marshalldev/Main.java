package xyz.marshalldev;

import xyz.marshalldev.Circle.TestCircle;
import xyz.marshalldev.Employee.TestEmployee;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius for the circle: ");
        double radius = scan.nextDouble();
        new TestCircle(radius);

        new TestEmployee();
    }
}
