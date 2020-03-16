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
        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        String vehicleName = scanner.nextLine();
        System.out.println("Entered name: " + vehicleName);



        System.out.println( "Welcome to the racing game!" );

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;
        carReference.fuelLevel = 100;
        carReference.damaged = true;



//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000 ;

        Engine engine1 = new Engine();


        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        carReference.engine = engine1;

        double currentDistance = carReference.accelerate(60, 1);

        System.out.println("Current distance: " + currentDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);

        System.out.println("Is car damaged?: " + carReference.damaged);


        // One object with two references

        System.out.println("Engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        engine1.capacity = 2100;

        System.out.println("Update engine details");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);





        //concatenation
        System.out.println("Properties of " + carReference.name);
        System.out.println("Color: " + carReference.color);
        System.out.println("maxSpeed: "  + carReference.maxSpeed);
        System.out.println("mileage: " + carReference.mileage);
        System.out.println("fuelLever: " + carReference.fuelLevel);
        System.out.println("racingNumber: " + carReference.racingNumber);
        System.out.println("damaged: " + carReference.damaged);


//        carReference = null;


        Car car2 = new Car();
        car2.name = "Lamborghini";
        car2.damaged = true;


        //concatenation
        System.out.println("Properties of " + car2.name);
        System.out.println("Color: " + car2.color);
        System.out.println("Damaged: " + car2.damaged);

        engine1.color = "blue";
        engine1.electric = false;
        engine1.screws = 100;

        //concatenation

        System.out.println("Properties of:" + engine1.color);
        System.out.println("Electric:" + engine1.electric);
        System.out.println("Screws:" + engine1.screws);

        car2.GPS = true;
        car2.price = 10000;
        car2.sits = 4;

        //concatenation

        System.out.println("Properties of:" + car2.GPS);
        System.out.println("Price:" + car2.price);
        System.out.println("Sits:" + car2.sits);

        //modal (modulo) operator
        //System.out.println(4 % 2);
        //System.out.println(4 % 2 == 0);
        //System.out.println(4 % 3);





     }
}
