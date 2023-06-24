package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {
    List<Flight> table = FlightRepository.getFlightsTable();

    public List<Flight> findFlightFrom(String departure){
        List<Flight> result = new ArrayList<>();
        for(Flight flight : table){
            if(flight.getDeparture().equals(departure))
                result.add(flight);
        }
        return result;
    }

    public List<Flight> findFlightTo(String arrival){
        List<Flight> result = new ArrayList<>();
        for(Flight flight : table){
            if (flight.getArrival().equals(arrival))
                result.add(flight);
        }
        return result;
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightTo("Kraków");
        for(Flight flight : result){
            System.out.println(flight.getArrival());
            System.out.println(flight.getDeparture());
            System.out.println(result.size());
        }
    }
}
