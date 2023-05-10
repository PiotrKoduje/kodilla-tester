package com.kodilla.abstracts.homework;

public class App {
    public static void main(String[] args) {
        Architect architect = new Architect(8000, "design");
        Pilot pilot = new Pilot(12000, "drive a plane");
        Baker baker = new Baker(5000,"bake breads and rolls");

        Person felek = new Person("Felek",38,baker);
        felek.showResponsibilities();

        Person andrzej = new Person("Andrzej", 42, pilot);
        andrzej.showResponsibilities();

        Person marek = new Person("Marek",29,architect);
        marek.showResponsibilities();
    }
}
