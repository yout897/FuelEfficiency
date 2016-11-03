

package fuelefficiency;


abstract class Vehicle {
    
    double type;
    
    public Vehicle( double type){
        this.type = type;
    }
    
    public double getDistance(double liters){
        liters = liters / type;
        liters = liters * 100;
        return liters;
    }
}
