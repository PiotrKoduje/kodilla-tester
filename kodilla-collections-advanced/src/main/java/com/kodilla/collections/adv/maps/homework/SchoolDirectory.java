package com.kodilla.collections.adv.maps.homework;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> map = new HashMap<>();

        Principal andrzej = new Principal("Andrzej","Grabowski");
        Principal marek = new Principal("Marek","Grechuta");
        Principal grzegorz = new Principal("Grzegorz","Turnau");

        School nr1 = new School("Szkoła Podstawowa nr 1", Arrays.asList(21,23,19,18,21,25,23,26));
        School nr2 = new School("Liceum Ogólnokształcące nr 2",Arrays.asList(27,26,28,29));
        School nr3 = new School("Zespół Szkół Zawodowych nr 3",Arrays.asList(24,25,26,23));

        map.put(andrzej,nr1);
        map.put(marek,nr2);
        map.put(grzegorz,nr3);

        System.out.println(nr1);

        for(Map.Entry<Principal,School> one : map.entrySet()){
            System.out.println("-----------------------------------------------");
            System.out.println("Dyrektor: " + one.getKey().getFirstName() + " " + one.getKey().getLastName());
            System.out.println("Prowadzi szkołę: " + one.getValue().getName());
            System.out.println("Całkowita ilość uczniów w tej szkole to: " + one.getValue().getNumberOfAllPupils());
        }
        System.out.println("-----------------------------------------------");
    }
}
