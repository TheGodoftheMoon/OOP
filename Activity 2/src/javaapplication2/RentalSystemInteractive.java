package javaapplication2;

import java.util.Scanner;

import java.util.Scanner;

public class RentalSystemInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create vehicles using subclass constructors
        Vehicle[] cars = {
            new Car("Toyota", "Camry", 50.0, 4),
            new Car("Honda", "Civic", 45.0, 4)
        };
        Vehicle[] trucks = {
            new Truck("Ford", "F-150", 80.0, 2.5),
            new Truck("Chevy", "Silverado", 85.0, 3.0)
        };
        Vehicle[] motorcycles = {
            new Motorcycle("Harley-Davidson", "Street 750", 40.0, true),
            new Motorcycle("Yamaha", "MT-15", 35.0, false)
        };
        Vehicle[] electricCars = {
            new ElectricCar("Tesla", "Model 3", 100.0, 75.0),
            new ElectricCar("Nissan", "Leaf", 90.0, 62.0)
        };

        System.out.println("=== VEHICLE RENTAL SYSTEM ===");
        System.out.println("1. Car\n2. Truck\n3. Motorcycle\n4. Electric Car");
        System.out.print("Select vehicle type (1–4): ");
        int typeChoice = scanner.nextInt();

        Vehicle[] selectedCategory = null;
        switch (typeChoice) {
            case 1: selectedCategory = cars; break;
            case 2: selectedCategory = trucks; break;
            case 3: selectedCategory = motorcycles; break;
            case 4: selectedCategory = electricCars; break;
            default:
                System.out.println("Invalid vehicle type.");
                scanner.close();
                return;
        }

        System.out.println("\nAvailable Models:");
        for (int i = 0; i < selectedCategory.length; i++) {
            System.out.print((i + 1) + ". ");
            selectedCategory[i].displayDetails();
            System.out.println();
        }

        System.out.print("Select model (1–" + selectedCategory.length + "): ");
        int modelChoice = scanner.nextInt();
        if (modelChoice < 1 || modelChoice > selectedCategory.length) {
            System.out.println("Invalid selection.");
            scanner.close();
            return;
        }

        Vehicle selectedVehicle = selectedCategory[modelChoice - 1];

        System.out.print("Enter rental days: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Enter discount (%) (0 if none): ");
        double discount = scanner.nextDouble();

        // Display results
        System.out.println("\n=== RENTAL SUMMARY ===");
        selectedVehicle.displayDetails();
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Standard Cost: $" + selectedVehicle.calculateRentalCost(rentalDays));
        System.out.println("Discounted Cost: $" + selectedVehicle.calculateDiscountedRentalCost(rentalDays, discount));
        selectedVehicle.performMaintenance();

        if (selectedVehicle instanceof ElectricCar) {
            ((ElectricCar) selectedVehicle).displayBatteryInfo();
        }

        scanner.close();
    }
}

