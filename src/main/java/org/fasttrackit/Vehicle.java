package org.fasttrackit;


public class Vehicle {

    // static variable/ class variable
    private static int totalVehicleCount;

    //instance variables
    private int racingNumber;
    private String name;
    private int maxSpeed;
    private double mileage;
    private String color;
    private double fuelLevel;
    private double totalDistance;
    private boolean damaged;
    private boolean GPS;
    private int sits;
    private double price;

    public  Vehicle(){
        totalVehicleCount++;
    }

    //method overLoading
    public  double accelerate (double speed){
        return accelerate(speed,1);
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
    public void setName(String name){
        this.name = name;
    }

    public int getRacingNumber() {
        return racingNumber;
    }

    public void setRacingNumber(int racingNumber) {
        this.racingNumber = racingNumber;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //read-only property
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }
}

