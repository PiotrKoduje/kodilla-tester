package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static List<Student> list = new ArrayList<>();

    public static String protectTeacherAgainstNull(Student s){
        Teacher teacher = s.getTeacher();
        String protectedTeacher = Optional.ofNullable(teacher).orElse(new Teacher("undefined")).getName();
        return protectedTeacher;
    }

    public static void printTheList (List<Student> l){
        for(Student s : l){
           protectTeacherAgainstNull(s);
            System.out.println("Uczeń: " + s.getName() + " - " + "Nauczyciel: " + protectTeacherAgainstNull(s));
        }
    }

    public static void main(String[] args) {
        Student adam = new Student("Adam Nowak", new Teacher("Stefan Twardowski"));
        Student tom = new Student("Tomek Zaręba", null);
        Student ann = new Student("Ania Wyszkoni", new Teacher("Grzeogorz Marcinkiewicz"));
        Student kate = new Student("Katarzyna Jurek",null);

        list.add(adam);
        list.add(tom);
        list.add(ann);
        list.add(kate);

        printTheList(list);
    }
}