package javaapplication2;


import javaapplication2.Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, double rentalPrice, int numberOfDoors) {
        super(make, model, rentalPrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing general car maintenance.");
    }
}
