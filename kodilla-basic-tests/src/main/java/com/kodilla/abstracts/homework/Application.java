package com.kodilla.abstracts.homework;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        System.out.println("\nKoło o promieniu 3:");
        Circle circle = new Circle(3);
        System.out.println("Obwód: " + circle.perimeter());
        System.out.println("Pole: " + circle.area() + "\n");


        System.out.println("Kwadrat o boku 5:");
        Square square = new Square(5);
        System.out.println("Obwód: " + square.perimeter());
        System.out.println("Pole: " + square.area() + "\n");

        System.out.println("Trójkąt o bokach 3, 4, 5:");
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Obwód: " + triangle.perimeter());
        System.out.println("Pole: " + triangle.area());

    }
}
