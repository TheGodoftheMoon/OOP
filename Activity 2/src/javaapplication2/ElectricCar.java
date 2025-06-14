package javaapplication2;

public class ElectricCar extends Vehicle {
    private double batteryCapacity;

    public ElectricCar(String make, String model, double rentalPrice, double batteryCapacity) {
        super(make, model, rentalPrice);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void displayBatteryInfo() {
        System.out.println("Battery Info: " + batteryCapacity + " kWh capacity.");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking battery health and charging system.");
    }
}
