/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

import java.util.Scanner;

/**
 * @author aldic2547
 * Date: 3/11/2016
 * Purpose: Ask how many liters the user wishes to run on
 *          then calculate how many Kilometers it will run for.
 */
public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Vehicles 
        Car car = new Car(9.4);
        HybridCar hybrid = new HybridCar(3.8);
        Motorcycle cycle = new Motorcycle(6.3);
        Truck truck = new Truck(14.1);
        //Getting user input
        System.out.println("How many liters are you running on?");
        double input = scan.nextDouble();
        //Printing the results based on user input
        System.out.println("\nOn " + input + "L of gas the vehicles can drive:"
                + "\nCar =     \t" + car.getDistance(input) + "KM"
                + "\nTruck =  \t" + truck.getDistance(input) + "KM"
                + "\nHybrid Car =\t" + hybrid.getDistance(input) + "KM"
                + "\nMotorcycle =\t" + cycle.getDistance(input) + "KM");
    }
    
}
