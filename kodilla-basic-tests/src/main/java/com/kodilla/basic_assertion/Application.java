package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if (correct){
            System.out.println("Metoda sum działa poprawdnie dla liczb " + a + " i " + b);
        }   else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.sub(b,a);
        correct = ResultChecker.assertEquals(3,subResult);
        if (correct){
            System.out.println("Metoda sub działa poprawnie dla liczb " + b + " i " + a);
        }   else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + b + " i " + a );
        }

        int powResult = calculator.pow(a);
        correct = ResultChecker.assertEquals(25, powResult);
        if (correct){
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        }   else {
            System.out.println("Metoda pow nie działa poprawdnie dla liczby " + a);
        }


        PrimeChecker checker = new PrimeChecker();
        System.out.println("PrimeChecker Test: " + checker.isPrime(2));
    }
}
