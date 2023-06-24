package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfPupils = new ArrayList<>();
    private String name;

    public List<Integer> getNumberOfPupils() {
        return numberOfPupils;
    }

    public String getName() {
        return name;
    }

    public School(String name, List<Integer> numberOfPupils){
        this.name = name;
        this.numberOfPupils = numberOfPupils;
    }

    public int getNumberOfAllPupils(){
        int sum = 0;
        for(Integer number : numberOfPupils){
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfPupils=" + numberOfPupils +
                ", name='" + name + '\'' +
                '}';
    }
}
