public class Motorcycle extends Vehicle{
    private double fuelConsumption;
    private double distance;
    public Motorcycle(String plateNumber, double capacity, double fuelConsumption, double distance) {
        super(plateNumber, capacity);
        this.fuelConsumption = fuelConsumption;
        this.distance = distance;
    }
    
    @Override
    public double calculateOperationalCost(){
        return fuelConsumption * distance * 1.2;
    }
}
