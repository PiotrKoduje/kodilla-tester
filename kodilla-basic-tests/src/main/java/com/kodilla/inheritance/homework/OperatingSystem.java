package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year){
        this.year = year;
    }

    public void turnOn(){
        System.out.println("Ping, ping, I'm starting");
    }

    public void turnOff(){
        System.out.println("Bum, bum, I'm shutting down");
    }
}
