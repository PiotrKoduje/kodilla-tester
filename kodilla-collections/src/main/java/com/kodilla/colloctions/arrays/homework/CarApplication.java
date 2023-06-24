package com.kodilla.colloctions.arrays.homework;

import com.kodilla.colloctions.interfaces.homework.Audi;
import com.kodilla.colloctions.interfaces.homework.Peugeot;
import com.kodilla.colloctions.interfaces.homework.BMW;
import com.kodilla.colloctions.interfaces.homework.Car;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15) + 1];

        System.out.println("Table of " + cars.length + " random cars:");

        for (int i = 0;i < cars.length;i++){
            cars[i] = drawCar();
        }

        for(Car car : cars){
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar(){
        String[] colours = {"red","blue","green","orange","pink","black","yellow","silver"};
        int drawnCar = RANDOM.nextInt(3);
        int randomSpeeding = RANDOM.nextInt(11 ) + 5;
        int randomBraking = RANDOM.nextInt(11 ) + 6;
        int randomColour = RANDOM.nextInt(colours.length);

        if (drawnCar == 0)
            return new Audi(randomSpeeding,randomBraking,colours[randomColour]);
        else if (drawnCar == 1)
            return new BMW(randomSpeeding,randomBraking,colours[randomColour]);
        else
            return new Peugeot(randomSpeeding,randomBraking,colours[randomColour]);
    }
}

