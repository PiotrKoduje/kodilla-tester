package com.kodilla.inheritance.homework;

public class WindowsSystem extends OperatingSystem{
    public WindowsSystem(int year){
        super(year);
    }
    @Override
    public void turnOn(){
        System.out.println("Windows System. Welcome :)");
    }

    @Override
    public void turnOff(){
        System.out.println("Windows System. Good bye");
    }
}
