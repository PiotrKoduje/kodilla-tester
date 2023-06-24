package com.kodilla.colloctions.arrays;

import com.kodilla.colloctions.interfaces.Circle;
import com.kodilla.colloctions.interfaces.Shape;
import com.kodilla.colloctions.interfaces.Square;
import com.kodilla.colloctions.interfaces.Triangle;
import com.kodilla.colloctions.interfaces.homework.Audi;

public class ShapeUtils {

    public static void displayShapeInfo(Shape shape){
        System.out.println("-----------------------------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }

    private static String getShapeName(Shape shape){
        if (shape instanceof Circle)
            return "Cirlce";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name";
    }
}
