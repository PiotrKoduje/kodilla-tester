package com.kodilla.inheritance.homework;

import java.util.IllegalFormatWidthException;

public class SystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem  = new OperatingSystem(2023);
        System.out.println("\n\nParent class: OperatingSystem.");
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println("\n");

        AppleSystem appleSystem = new AppleSystem(2022);
        System.out.println("Child class: AppleSystem.");
        appleSystem.turnOn();
        appleSystem.turnOff();
        System.out.println("\n");

        WindowsSystem windowsSystem = new WindowsSystem(2021);
        System.out.println("Child class: WindowsSystem.");
        windowsSystem.turnOn();
        windowsSystem.turnOff();
        System.out.println("\n");
    }
}
