//parent class
class Vehicle {
    // final variable (cannot be changed)
    final int maxSpeed = 180;

    // final method (cannot be overridden)
    final void displaySpeed() {
        System.out.println("Maximum speed of vehicle: " + maxSpeed + " km/h");
    }
}

// Child class
class Car extends Vehicle {
    // Trying to override final method will cause an error
    // void displaySpeed() {
    //     System.out.println("Overridden speed method");
    // }

    void carInfo() {
        System.out.println("Car class extends Vehicle but cannot override final methods.");
    }
}

// Attempting to extend a final class (if uncommented below) would cause an error
// final class Bike {}
// class SportsBike extends Bike {}  // ❌ Not allowed

// Main class
public class FinalKeywordExample {
    public static void main(String[] args) {
        Car car1 = new Car();

        // Access final variable
        System.out.println("Accessing final variable:");
        System.out.println("Max Speed: " + car1.maxSpeed);

        System.out.println("\nCalling final method:");
        car1.displaySpeed();

        System.out.println("\nExtra Info:");
        car1.carInfo();
    }
}
