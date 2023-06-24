package com.kodilla.colloctions.arrays;

import com.kodilla.colloctions.interfaces.Circle;
import com.kodilla.colloctions.interfaces.Shape;
import com.kodilla.colloctions.interfaces.Square;
import com.kodilla.colloctions.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for (int n = 0;n < 5;n++){
            shapes[n] = drawShape();
        }
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        int drawnShapeKind = RANDOM.nextInt(3);
        double a = getRandmSize(RANDOM);

        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandmSize(RANDOM);
            double c = getRandmSize(RANDOM);
            return new Triangle(a,b,c);
        }
    }

    private static double getRandmSize(Random random) {
        return RANDOM.nextDouble() * 100 + 1;
    }
}
