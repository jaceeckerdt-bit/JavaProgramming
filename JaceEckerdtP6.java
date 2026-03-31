import java.util.Random;
import java.util.Scanner;

public class JaceEckerdtP6 {

    static final double NEW_PLATE_COST = 45.00;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        // Header
        System.out.println("Name: Jaycee (Jace) Eckerdt");
        System.out.println("Course: COP-2800 Java Programming");
        System.out.println("Assignment: Showing Chickens at The Fair");
        System.out.println("Due Date: March 22, 2026\n");

        do {
            // Main Menu
            System.out.println("DMV Menu:");
            System.out.println("1. Random Plate");
            System.out.println("2. Custom Plate");
            System.out.println("3. Plate Renewal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    randomPlate();
                    break;
                case 2:
                    customPlate(input);
                    break;
                case 3:
                    renewalMenu(input);
                    break;
                case 4:
                    System.out.println("Thank you for visiting the DMV. Have a good day!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }

        } while (choice != 4);

        input.close();
    }

    // Generate Random Plate
    public static void randomPlate() {
        Random rand = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String plate = "";

        for (int i = 0; i < 6; i++) {
            int index = rand.nextInt(characters.length());
            plate += characters.charAt(index);

            if (i == 2) {
                plate += "-";
            }
        }

        System.out.println("Generated Plate: " + plate);
        System.out.printf("Cost: $%.2f%n%n", NEW_PLATE_COST);
    }

    // Custom Plate
    public static void customPlate(Scanner input) {
        System.out.print("Enter your custom plate (2-8 characters): ");
        String plate = input.nextLine().toUpperCase();

        if (!isValidPlate(plate)) {
            System.out.println("Error: Invalid plate format.\n");
            return;
        }

        double cost = calculateCustomCost(plate);

        System.out.println("Custom Plate: " + plate);
        System.out.printf("Cost: $%.2f%n%n", cost);
    }

    // Renewal Menu
    public static void renewalMenu(Scanner input) {
        System.out.println("Renewal Menu:");
        System.out.println("1. Standard Plate Renewal");
        System.out.println("2. Custom Plate Renewal");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            double cost = NEW_PLATE_COST * 0.50;
            System.out.printf("Renewal Cost: $%.2f%n%n", cost);

        } else if (choice == 2) {
            System.out.print("Enter your custom plate: ");
            String plate = input.nextLine().toUpperCase();

            if (!isValidPlate(plate)) {
                System.out.println("Error: Invalid plate.\n");
                return;
            }

            double cost = (NEW_PLATE_COST * 0.50) + (plate.length() * 1.00);
            System.out.printf("Custom Renewal Cost: $%.2f%n%n", cost);

        } else {
            System.out.println("Invalid choice.\n");
        }
    }

    // Validate Plate
    public static boolean isValidPlate(String plate) {

        if (plate.length() < 2 || plate.length() > 8) {
            return false;
        }

        for (int i = 0; i < plate.length(); i++) {
            char c = plate.charAt(i);

            if (!(Character.isLetter(c) || Character.isDigit(c) || c == '-')) {
                return false;
            }
        }

        return true;
    }

    // Calculate Custom Cost
    public static double calculateCustomCost(String plate) {
        double cost = NEW_PLATE_COST;

        for (int i = 0; i < plate.length(); i++) {
            char c = plate.charAt(i);

            if (Character.isLetter(c)) {
                cost += 1.25;
            } else if (Character.isDigit(c)) {
                cost += 1.00;
            }
            // dashes are free
        }

        return cost;
    }
}