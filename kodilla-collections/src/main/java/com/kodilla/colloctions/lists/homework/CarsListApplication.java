package com.kodilla.colloctions.lists.homework;

import com.kodilla.colloctions.arrays.homework.CarUtils;
import com.kodilla.colloctions.interfaces.homework.Audi;
import com.kodilla.colloctions.interfaces.homework.BMW;
import com.kodilla.colloctions.interfaces.homework.Car;
import com.kodilla.colloctions.interfaces.homework.Peugeot;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Audi(7,5,"red"));
        cars.add(new BMW(10,7,"blue"));
        cars.add(new Peugeot(5,4,"plump"));

        for (Car car : cars){
            CarUtils.describeCar(car);
        }

        System.out.println("Długość listy: " + cars.size());
        System.out.println("Koniec pierwszej części");

        cars.remove(0);
        BMW bmw = new BMW(10,7,"blue");
        cars.remove(bmw);

        for (Car car : cars){
            CarUtils.describeCar(car);
        }

        System.out.println("Długość listy: " + cars.size());
    }
}
