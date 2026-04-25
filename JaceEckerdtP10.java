/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: P10 Managing The Chicken Farm
Date: 04/24/2026
Description: A Java project used to determine the health and productivity of the chickens.
*/

import java.util.Scanner;

public class JaceEckerdtP10 {

    // Scanner
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Call welcome method
        printWelcome();

        boolean keepGoing = true;

        // Loop until user decides to exit
        while (keepGoing) {

            int chickenType = getChickenType();
            int healthType = getHealthStatus();

            float eggsPerYear = calculateEggProduction(chickenType, healthType);
            String valueMessage = getValueMessage(eggsPerYear);

            // Display results
            System.out.println("\nChicken Report:");
            System.out.println("Expected eggs per year: " + eggsPerYear);
            System.out.println("Value assessment: " + valueMessage);

            // Ask user if they want to continue
            System.out.print("\nDo you want to enter another chicken? (y/n): ");
            String choice = input.next();

            if (!choice.equalsIgnoreCase("y")) {
                keepGoing = false;
            }
        }

        System.out.println("\nFinal report complete. Goodbye!");
    }

    // Welcome message (void, no parameters)
    public static void printWelcome() {
        System.out.println("Welcome to the Chicken Farm Program!");
        System.out.println("You will enter chicken type and health to estimate egg production.\n");
    }

    // Get chicken type (returns int)
    public static int getChickenType() {
        System.out.println("Select chicken type:");
        System.out.println("1: Rhode Island Red");
        System.out.println("2: Americana");
        System.out.println("3: Longhorn");
        System.out.print("Enter choice: ");

        return input.nextInt();
    }

    // Get health status (returns int)
    public static int getHealthStatus() {
        System.out.println("\nSelect chicken health:");
        System.out.println("0: Healthy");
        System.out.println("1: Under weight");
        System.out.println("2: Over weight");
        System.out.println("3: Droopy comb");
        System.out.print("Enter choice: ");

        return input.nextInt();
    }

    // Calculate egg production (returns float, takes 2 ints)
    public static float calculateEggProduction(int type, int health) {

        int productionCount = 0;
        float healthValue = 0;

        // Chicken type values
        switch (type) {
            case 1:
                productionCount = 7;
                break;
            case 2:
                productionCount = 5;
                break;
            case 3:
                productionCount = 6;
                break;
            default:
                System.out.println("Invalid chicken type.");
        }

        // Health values
        switch (health) {
            case 0:
                healthValue = 1.0f;
                break;
            case 1:
                healthValue = 0.7f;
                break;
            case 2:
                healthValue = 0.9f;
                break;
            case 3:
                healthValue = 0.5f;
                break;
            default:
                System.out.println("Invalid health status.");
        }

        return productionCount * healthValue * 52;
    }

    // Value assessment (returns String, takes float)
    public static String getValueMessage(float eggs) {
        if (eggs > 300) {
            return "great value";
        } else if (eggs > 200) {
            return "good value";
        } else {
            return "consider fried chicken";
        }
    }
}