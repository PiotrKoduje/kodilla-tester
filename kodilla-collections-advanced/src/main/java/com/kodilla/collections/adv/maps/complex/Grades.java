package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(List<Double> grades){
        this.grades = grades;
    }

    public double getAverage(){
        if (grades.size() == 0)
            return 0;
        double sum = 0;
        for (Double grade : grades){
            sum += grade;
        }
        return sum/grades.size();
    }

    @Override
    public String toString() {
        return "Grades{" +
                "grades=" + grades +
                '}';
    }

    public List<Double> getGrades() {
        return grades;
    }
}
