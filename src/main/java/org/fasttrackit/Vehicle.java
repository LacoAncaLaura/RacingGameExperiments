package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {

    // static variable/ class variable
    static int totalVehicleCount;

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

    public  Vehicle(){
        totalVehicleCount++;
    }

    public double accelerate (double speed, double durationInHours) {
        if (fuelLevel <= 0) {

            System.out.println( "Not enough fuel.");
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println( "Max speed exceeded");
            return 0;
        }else if (speed == maxSpeed) {
            System.out.println("Be careful! Max speed reached!");
        }else {
            System.out.println("Valid speed entered");
        }
      double mileageMultiplier = 1;
        if (speed > 120){
            mileageMultiplier = speed / 100;}


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

    public void decelerate (){
        //TODO: implement this
        System.out.println("This is just a demo method");
    }
}
