package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {
    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        showComputerNumbers(computerNumbers);
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void showComputerNumbers(Set<Integer> computerNumbers) {
        for(Integer n : computerNumbers)
            System.out.println(n);
        }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }
    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }
    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }
    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }

    public static void main(String[] args) throws InvalidNumbersException {
        GamblingMachine machine = new GamblingMachine();
        Set<Integer> usersNumbers = new HashSet<>();
        usersNumbers.add(5);
        usersNumbers.add(16);
        usersNumbers.add(24);
        usersNumbers.add(34);
        usersNumbers.add(39);
        usersNumbers.add(41);

        System.out.println("Hits: " + machine.howManyWins(usersNumbers));



    }
    }
