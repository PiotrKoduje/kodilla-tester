package com.kodilla.colloctions.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
    Set<Stamp> stamps = new HashSet<>();

    stamps.add(new Stamp("Penny Black",30,40,true));
    stamps.add(new Stamp("Bull's eye",29,42,false));
    stamps.add(new Stamp("Red Mercury",32,45,true));
    stamps.add(new Stamp("Bull's eye",29,42,false));

    System.out.println("Ileość elementów w zbiorze: " + stamps.size());

        for (Stamp stamp : stamps){
            System.out.println(stamp);
        }
    }
}
