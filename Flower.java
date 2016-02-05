package com.dmtihor.homework2;

public abstract class Flower implements Comparable<Flower> {
    String colour;
    String name = getClass().getSimpleName();


    public Flower(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return this.name + " " + this.colour;
    }

    public int compareTo(Flower f) {
        if (this.name.length() > f.name.length()) {
            return 1;
        } else if (this.name.length() < f.name.length()) {
            return -1;
        } else {
            if (this.colour.length() > f.colour.length()) {
                return 1;
            } else if (this.name.length() < f.name.length()) {
                return -1;
            } else return 0;
        }
    }
}
