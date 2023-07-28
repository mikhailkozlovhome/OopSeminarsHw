package Task2;

public class Bus extends Vehicle{

    @Override
    double calculateAllowedSpeed() {
        return super.maxSpeed * 0.6;
    }
    
}
