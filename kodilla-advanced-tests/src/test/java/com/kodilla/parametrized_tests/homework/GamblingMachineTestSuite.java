package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTrue.csv",numLinesToSkip = 1, delimiter = '|')
    public void correctDataForHowManyWins(String input) throws InvalidNumbersException {
        String[] data = input.split(",");
        Set<Integer> usersNumbers = new HashSet<>();
        for(String d : data){
            usersNumbers.add(Integer.parseInt(d));
        }
        int wins = machine.howManyWins(usersNumbers);
        assertTrue(wins >= 0 && wins <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineFalse.csv",numLinesToSkip = 1, delimiter = '|')
    public void incorrectDataForHowManyWins(String input) {
        String[] data = input.split(",");
        Set<Integer> usersNumbers = new HashSet<>();
        for(String d : data){
            usersNumbers.add(Integer.parseInt(d));
        }
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(usersNumbers));
    }
}