/*
Implement a class hierarchy for Vehicles with a base class Vehicle 
that contains a method startEngine(). Derive two classes: Car and 
Motorcycle, both overriding the startEngine() method to print different 
messages indicating how their engines are started. Create a method 
vehicleTestDrive(Vehicle vehicle) that accepts any object of type 
Vehicle and calls its startEngine() method. Demonstrate polymorphism 
by passing different vehicle objects to this method.
 */
class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }
}
class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine is starting...");
    }
}
class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine is starting...");
    }
}
public class Vehicles {
    static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        vehicleTestDrive(v1);
        Vehicle v2=new Car();
        vehicleTestDrive(v2);
        Vehicle v3=new Motorcycle();
        vehicleTestDrive(v3);
    }
}
