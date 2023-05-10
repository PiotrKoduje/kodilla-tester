package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double side;
    public Square (double side){
        this.side = side;
    }


    @Override
    double perimeter() {
        double result = 4*this.side;
        return result;
    }

    @Override
    double area() {
        double result = this.side*this.side;
        return result;
    }
}
