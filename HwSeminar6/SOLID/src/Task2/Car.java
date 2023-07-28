package Task2;

public class Car extends Vehicle {

    @Override
    double calculateAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }
    
}
