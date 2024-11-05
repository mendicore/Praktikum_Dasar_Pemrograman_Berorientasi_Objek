public class Van extends Vehicle {
    private double hourlyRate;
    private int hoursUsed;

    public Van(String plateNumber, double capacity, double hourlyRate, int hoursUsed) {
        super(plateNumber, capacity);
        this.hourlyRate = hourlyRate;
        this.hoursUsed = hoursUsed;
    }
    
    @Override
    public double calculateOperationalCost(){
        return hourlyRate * hoursUsed;
    }
}
