package com.kodilla.colloctions.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(37,12,"red");
        BMW bmw = new BMW(28,7,"blue");
        Peugeot peugeot = new Peugeot(23,5,"green");

        CarRace carRace = new CarRace();
        carRace.doRace(audi);
        carRace.doRace(bmw);
        carRace.doRace(peugeot);
    }

     void doRace(Car car){
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        System.out.println("Końcowa prędkość samochodu wynosi: " + car.getSpeed());
    }
}
