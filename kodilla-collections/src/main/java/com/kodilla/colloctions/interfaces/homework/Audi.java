package com.kodilla.colloctions.interfaces.homework;

import java.util.Objects;

public class Audi implements Car{
    private String colour;
    private int speed = 0;

    public String getColour() {
        return colour;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getBraking() {
        return braking;
    }

    private int acceleration;
    private int braking;

    public Audi(int acceleration, int braking, String colour) {
        this.acceleration = acceleration;
        this.braking = braking;
        this.colour = colour;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += acceleration;
    }

    @Override
    public void decreaseSpeed() {
        speed -= braking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed && acceleration == audi.acceleration && braking == audi.braking && Objects.equals(colour, audi.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, speed, acceleration, braking);
    }
}
