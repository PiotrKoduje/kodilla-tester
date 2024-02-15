package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal dog1 = new Dog();
        Duck duck = new Duck();
        Animal duck1 = new Duck();

        AnimalProcessor animalProcessor = new AnimalProcessor();
        animalProcessor.process(dog);
        animalProcessor.process(duck);
        animalProcessor.process(dog1);
        animalProcessor.process(duck1);
    }
}
