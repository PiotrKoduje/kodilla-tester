package com.kodilla.colloctions.interfaces.homework;

import java.util.Objects;

public class BMW implements Car{
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

    public BMW(int acceleration, int braking, String colour) {
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
        BMW bmw = (BMW) o;
        return speed == bmw.speed && acceleration == bmw.acceleration && braking == bmw.braking && Objects.equals(colour, bmw.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, speed, acceleration, braking);
    }
}
