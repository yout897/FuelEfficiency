

package fuelefficiency;


abstract class Vehicle {
    
    double type;
    //Assigns the type of vehicle
    public Vehicle( double type){
        this.type = type;
    }
    //Calculates the distance the vehicle can go based on user input
    public double getDistance(double liters){
        liters = liters / type;
        liters = liters * 100;
        return liters;
    }
}
