package com.kodilla.inheritance.homework;

public class AppleSystem extends OperatingSystem {

    public AppleSystem(int year){
        super(year);
    }
    @Override
    public void turnOn(){
        System.out.println("Apple System. Welcome :)");
    }

    @Override
    public void turnOff(){
        System.out.println("Apple System. Good bye");
    }
}
