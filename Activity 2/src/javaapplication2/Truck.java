package javaapplication2;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, double rentalPrice, double payloadCapacity) {
        super(make, model, rentalPrice);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }

    @Override
    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double cost = super.calculateDiscountedRentalCost(days, discountPercentage);
        if (days > 3) {
            cost -= cost * 0.05;
        }
        return cost;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking payload systems and engine oil for the truck.");
    }
}

