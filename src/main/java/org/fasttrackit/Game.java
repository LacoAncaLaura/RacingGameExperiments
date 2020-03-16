package org.fasttrackit;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Game {
    
    public  void start(){
        System.out.println("Welcome!");

        int getPlayerCountFromUser = 1;
        int playerCount = getPlayerCountFromUser;
        
    }
    public String getVehicleNameFromUser;
    {
        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
       return scanner.nextLine();
    }
    private int getPlayerCountFromUser(){
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
