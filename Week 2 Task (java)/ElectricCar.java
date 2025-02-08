package oops;

public class ElectricCar extends Car{
	private int batteryRange; // Battery range in miles

    // Constructor
    public ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }

    // Getter and setter for battery range
    public int getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    // Method to charge the battery
    public void chargeBattery() {
        System.out.println("Charging the battery of " + getMake() + " " + getModel() + ". Battery range: " + batteryRange + " miles.");
    }

    // Overriding startEngine() for ElectricCar
    @Override
    public void startEngine() {
        System.out.println("Starting the electric engine of " + getMake() + " " + getModel() + ".");
    }
}



