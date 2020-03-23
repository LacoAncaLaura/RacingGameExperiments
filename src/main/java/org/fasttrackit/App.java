package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();
        game.start();

////Method implementation taken from object class,not from variable`s class
//        Vehicle cheater = new CheatingVehicle();
//        cheater.setName("Cheater");
//
//
//        cheater.accelerate(60,1);
//        System.out.println("Total distance" + cheater.getTotalDistance());
//
//        //variable type decides what methods can be invoked
//        //Type casting
//        ((CheatingVehicle)cheater).fly();
//
//        Vehicle vehicle1 = new Vehicle();
//        //vehicle1.getTotalVehicleCount() = 1;
//
//        Vehicle vehicle2 = new Vehicle();
//        //vehicle2.getTotalVehicleCount() = 2;
//
//        //Vehicle.getTotalVehicleCount() = 50;
//
//        System.out.println("Total count from vehicle1: " + vehicle1.getTotalVehicleCount());
//        System.out.println("Total count from vehicle2: " + vehicle2.getTotalVehicleCount());
//        System.out.println("Total count from Vehicle class: " + Vehicle.getTotalVehicleCount());
//
//
//        new AutoVehicle(new Engine());
//
//        System.out.println("Please enter vehicle name: ");
//        Scanner scanner = new Scanner(System.in);
//        String vehicleName = scanner.nextLine();
//        System.out.println("Entered name: " + vehicleName);
//
//
//
//        System.out.println( "Welcome to the racing game!" );
//
//        Engine engine1 = new Engine();
//        engine1.manufacturer = "VW";
//        engine1.capacity = 2000;
//
//        Car carReference = new Car(new Engine());
//        carReference.setName("Audi");
//        carReference.setColor("red");
//        carReference.setMaxSpeed(260);
//        carReference.setMileage(6.2);
//        carReference.setFuelLevel(100);
//        carReference.setDamaged(true);
//
//
//
//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000 ;
//
//
//
//        double currentDistance = carReference.accelerate(60, 1);
//
//        System.out.println("Current distance: " + currentDistance);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//
////        System.out.println("Is car damaged?: " + carReference.damaged);
//
//
//        // One object with two references
//
//        System.out.println("Engine details:");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//
//        engine1.capacity = 2100;
//
//        System.out.println("Update engine details");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);





        //concatenation
//        System.out.println("Properties of " + carReference.setName());
//        System.out.println("Color: " + carReference.setColor());
//        System.out.println("maxSpeed: "  + carReference.setMaxSpeed());
//        System.out.println("mileage: " + carReference.setMileage());
//        System.out.println("fuelLever: " + carReference.setFuelLevel());
//        System.out.println("racingNumber: " + carReference.setRacingNumber());
//        System.out.println("damaged: " + carReference.setDamaged());


////        carReference = null;
//
//
//        Car car2 = new Car(new Engine());
//        car2.name = "Lamborghini";
//        car2.damaged = true;
//
//
//        //concatenation
//        System.out.println("Properties of " + car2.name);
//        System.out.println("Color: " + car2.color);
//        System.out.println("Damaged: " + car2.damaged);
//
//        engine1.color = "blue";
//        engine1.electric = false;
//        engine1.screws = 100;
//
//        //concatenation
//
//        System.out.println("Properties of:" + engine1.color);
//        System.out.println("Electric:" + engine1.electric);
//        System.out.println("Screws:" + engine1.screws);
//
//        car2.GPS = true;
//        car2.price = 10000;
//        car2.sits = 4;
//
//        //concatenation
//
//        System.out.println("Properties of:" + car2.GPS);
//        System.out.println("Price:" + car2.price);
//        System.out.println("Sits:" + car2.sits);

        //modal (modulo) operator
        //System.out.println(4 % 2);
        //System.out.println(4 % 2 == 0);
        //System.out.println(4 % 3);





     }
}
