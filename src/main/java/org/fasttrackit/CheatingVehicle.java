package org.fasttrackit;

public class CheatingVehicle extends Vehicle{
    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + "is accelerating with " + speed + durationInHours + "h");
        double distance = 2 * speed * durationInHours;
        setTotalDistance(getTotalDistance() + distance);
        System.out.println("Cheater!!!" );
        return distance;
    }
    //access can be more permissive then in super class
    public CheatingVehicle clone(){
        return new CheatingVehicle();
    }
    public void fly(){
        System.out.println("Flying!!!");
    }
}
