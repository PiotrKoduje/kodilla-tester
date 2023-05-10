package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double perimeter() {
        double result = 2*Math.PI*this.radius;
        return result;
    }

    @Override
    double area() {
        double result = Math.PI*this.radius*this.radius;
        return result;
    }
}
