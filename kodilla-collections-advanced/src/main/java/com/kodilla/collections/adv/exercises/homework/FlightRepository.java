package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Kraków","Wrocław"));
        flights.add(new Flight("Wrocław","Warszawa"));
        flights.add(new Flight("Warszawa","Kraków"));
        flights.add(new Flight("Kraków","Warszawa"));
        flights.add(new Flight("Wrocław","Kraków"));
        flights.add(new Flight("Warszawa","Wrocław"));
        return flights;
    }
}
