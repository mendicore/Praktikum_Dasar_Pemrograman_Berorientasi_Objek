public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Truck("B1234CD", 10000, 0.2, 500),
            new Van("D5678EF", 2000, 10.0, 15),
            new HeavyDutyTruck("B1234CD", 10000, 0.2, 500),
            new Motorcycle("B1234CD", 10000, 0.2, 500),
        };
        
        for (Vehicle vehicle : vehicles) {
        vehicle.displayInfo(); 
        }
    }
 }
