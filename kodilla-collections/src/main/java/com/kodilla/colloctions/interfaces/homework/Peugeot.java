package com.kodilla.colloctions.interfaces.homework;

import java.util.Objects;

public class Peugeot implements Car{
    private String colour;
    private int speed = 0;
    private int acceleration;

    public String getColour() {
        return colour;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getBraking() {
        return braking;
    }

    private int braking;

    public Peugeot(int acceleration, int braking, String colour) {
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
        Peugeot peugeot = (Peugeot) o;
        return speed == peugeot.speed && acceleration == peugeot.acceleration && braking == peugeot.braking && Objects.equals(colour, peugeot.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, speed, acceleration, braking);
    }
}
