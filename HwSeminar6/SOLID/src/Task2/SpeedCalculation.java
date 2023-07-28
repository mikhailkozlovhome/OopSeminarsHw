package Task2;

//  Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
// Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed().
// Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP

// public class SpeedCalculation {
//     public double calculateAllowedSpeed(Vehicle vehicle) {
//         if (vehicle.getType().equalsIgnoreCase("Car")) {
//             return vehicle.getMaxSpeed() * 0.8;
//         } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
//             return vehicle.getMaxSpeed() * 0.6;
//         }
//         return 0;
//     }
// }

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}
