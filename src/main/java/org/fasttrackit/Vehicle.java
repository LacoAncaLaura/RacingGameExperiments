package org.fasttrackit;

public class Vehicle {

    //instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance;
    boolean damaged;
    boolean GPS;
    int sits;
    double price;

    public double accelerate (double speed, double durationInHours) {
        System.out.println(name  + "is accelerating with" + speed + "km/h for" + durationInHours + "h");
        //local variable
        double travelDistance = speed * durationInHours;

        System.out.println("Traveled Distance" + travelDistance);

        totalDistance += travelDistance;

        System.out.println("Total traveled Distance: " + travelDistance);

        double useFuel = travelDistance * mileage / 100;

        fuelLevel = fuelLevel - useFuel;

        // same result as the instruction above
        // fuelLevel -=useFuel;

        System.out.println("Remaining fuel:" + fuelLevel);


        return travelDistance;
    }
}
