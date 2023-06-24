package com.kodilla.colloctions.sets.homework;

import java.util.Arrays;
import java.util.Objects;

public class Stamp {
    private String name;
    private int[] dimensions = new int[2];
    private boolean isStamped;

    public Stamp(String name, int dim1, int dim2, boolean isStamped) {
        this.name = name;
        this.dimensions[0] = dim1;
        this.dimensions[1] = dim2;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped && Objects.equals(name, stamp.name) && Arrays.equals(dimensions, stamp.dimensions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, isStamped);
        result = 31 * result + Arrays.hashCode(dimensions);
        return result;
    }

//    @Override
//    public String toString() {
//        return "Stamp{" +
//                "name='" + name + '\'' +
//                ", dimensions=" + Arrays.toString(dimensions) +
//                ", isStamped=" + isStamped +
//                '}';
//    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensions=" + Arrays.toString(dimensions) +
                ", isStamped=" + isStamped +
                '}';
    }
}
