package javaapplication2;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected double rentalPrice;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPrice);
    }

    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }

    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double cost = calculateRentalCost(days);
        return cost - (cost * discountPercentage / 100);
    }

    public abstract void performMaintenance();
}
