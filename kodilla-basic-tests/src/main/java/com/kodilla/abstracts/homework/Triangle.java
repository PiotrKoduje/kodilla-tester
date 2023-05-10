package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double  sideA;
    private double sideB;
    private double sideC;
    private double p;   //half perimeter

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.p = (sideA + sideB + sideC)/2;
    }

    @Override
    double perimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }

    @Override
    double area() {
        double result = Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC));
        return result;
    }
}
