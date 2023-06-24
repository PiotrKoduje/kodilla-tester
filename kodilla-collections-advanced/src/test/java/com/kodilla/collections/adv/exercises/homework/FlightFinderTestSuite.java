package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void findFlightToShouldReturnZeroLengthListIfWrongCity(){
        //given
        //flightFinder

        //when
        int result = flightFinder.findFlightTo("Poznań").size();
        //then
        assertEquals(0,result);
    }

    @Test
    public void findFlightToShouldReturnSpecificValues(){
        //given
        //flightFinder

        //when
        List<Flight> result = flightFinder.findFlightTo("Kraków");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Kraków","Wrocław"));
        expectedList.add(new Flight("Kraków","Warszawa"));
        assertEquals(expectedList,result);
    }

    @Test
    public void findFlightFromShouldReturnZeroLengthListIfWrongCity(){
        //given
        //flightFinder

        //when
        int result = flightFinder.findFlightFrom("Gdańsk").size();
        //then
        assertEquals(0,result);
    }

    @Test
    public void findFlightFromShouldReturnSpecificValues(){
        //given
        //flightFinder

        //when
        List<Flight> result = flightFinder.findFlightFrom("Warszawa");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Wrocław","Warszawa"));
        expectedList.add(new Flight("Kraków","Warszawa"));
        assertEquals(expectedList,result);
    }
}