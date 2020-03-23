package org.fasttrackit;

public class Track {

    private String name;
    private double land;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLand() {
        return land;
    }

    public void setLand(double land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", land=" + land +
                '}';
    }
}
