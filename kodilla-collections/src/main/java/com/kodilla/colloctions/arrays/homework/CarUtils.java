package com.kodilla.colloctions.arrays.homework;

import com.kodilla.colloctions.interfaces.homework.Car;
import com.kodilla.colloctions.interfaces.homework.Audi;
import com.kodilla.colloctions.interfaces.homework.BMW;
import com.kodilla.colloctions.interfaces.homework.Peugeot;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("-----------------------");
        System.out.println("Type: " + getType(car));
        System.out.println("Colour: " + car.getColour());
        System.out.println("Acceletation: " + car.getAcceleration());
        System.out.println("Braking: " + car.getBraking());
    }

    private static String  getType(Car car){
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Peugeot)
            return "Peugeot";
        else
            return "Unknown type";
    }
}
