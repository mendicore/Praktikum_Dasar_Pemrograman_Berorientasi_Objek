public abstract class Vehicle {
    private String plateNumber  ;
    private double capacity;

    public Vehicle(String plateNumber, double capacity) {
        this.plateNumber = plateNumber;
        this.capacity = capacity;
    }
    
    public abstract double calculateOperationalCost();
    
    public void displayInfo(){
        System.out.printf("Vehicle Plate: %s, Capacity: %f kg, Operational cost: %f\n", this.plateNumber, this.capacity, this.calculateOperationalCost());
    }
}
