/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

import java.util.Scanner;

/**
 *
 * @author aldic2547
 */
public class FuelEfficiency {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Car car = new Car(9.4);
        HybridCar hybrid = new HybridCar(3.8);
        Motorcycle cycle = new Motorcycle(6.3);
        Truck truck = new Truck(14.1);
        
        System.out.println("How many liters are you running on?");
        double input = scan.nextDouble();
        System.out.println("\nOn " + input + "L of gas the vehicles can drive:"
                + "\nCar =     \t" + car.getDistance(input) + "KM"
                + "\nTruck =  \t" + truck.getDistance(input) + "KM"
                + "\nHybrid Car =\t" + hybrid.getDistance(input) + "KM"
                + "\nMotorcycle =\t" + cycle.getDistance(input) + "KM");
    }
    
}
