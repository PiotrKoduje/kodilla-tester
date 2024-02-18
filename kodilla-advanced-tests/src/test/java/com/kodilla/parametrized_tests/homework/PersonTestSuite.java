package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSource#provideDoubleForTestingBMI")
    public void shouldReturnSpecificDescription(double height, double weight,String description){
        Person person = new Person(height,weight);
        assertEquals(description,person.getBMI());
    }
}