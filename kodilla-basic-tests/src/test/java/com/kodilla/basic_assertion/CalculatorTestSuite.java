package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentLinkedQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int resultSum = calculator.sum(a,b);
        assertEquals(13,resultSum);
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int resultSub = calculator.sub(b,a);
        assertEquals(3,resultSub);
    }

    @Test
    public void testPowPositive(){
        Calculator calculator = new Calculator();
        int a = 5;
        int resultPow= calculator.pow(a);
        assertEquals(25,resultPow);
    }

    @Test
    public void testPowNegative(){
        Calculator calculator = new Calculator();
        int a = -6;
        int resultPow= calculator.pow(a);
        assertEquals(36,resultPow);
    }

    @Test
    public void testPowZero(){
        Calculator calculator = new Calculator();
        int a = 0;
        int resultPow= calculator.pow(a);
        assertEquals(0,resultPow);
    }
}
