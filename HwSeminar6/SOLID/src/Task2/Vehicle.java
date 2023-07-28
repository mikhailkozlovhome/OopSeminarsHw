package Task2;

public abstract class Vehicle {
    String type;
    Double maxSpeed;
    // public String getType() {
    //     return type;
    // }

    // public Double getMaxSpeed() {
    //     return maxSpeed;
    // }
    
    abstract double calculateAllowedSpeed();
}
