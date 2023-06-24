package com.kodilla.colloctions.lists;

import com.kodilla.colloctions.interfaces.Circle;
import com.kodilla.colloctions.interfaces.Shape;
import com.kodilla.colloctions.interfaces.Square;
import com.kodilla.colloctions.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        //shapes.add(new Square(10));
        Square square = new Square(10);

        shapes.add(square);
        shapes.add(new Circle(7));
        shapes.add(new Triangle(10,4,10.77));

        shapes.remove(1);
        shapes.remove(square);

        Triangle tri = new Triangle(10,4,10.77);
        shapes.remove(tri);

        for (Shape shape : shapes){
            System.out.println(shape + " Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
        }
    }
}
