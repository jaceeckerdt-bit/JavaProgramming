/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: P4 The Farmers Market
Date: 02/12/2026
Description: A  program used to determine the quality of chickens at the Hillsborough County Auction.
*/

import java.util.Scanner; // Scanner Import

public class JaceEckerdtP4 { // Declaring class
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the pivot quality code
        System.out.print("Enter the pivot quality code (positive integer): ");
        int pivot = scanner.nextInt();

        System.out.println("Enter chicken quality codes (0 to quit):");

        int chickenQuality;

        // Strings to store reports
        String acceptableCodes = "";
        String unacceptableCodes = "";

        // Counters
        int acceptableCount = 0;
        int unacceptableCount = 0;

        // While loop to keep accepting inputs
        while (true) {
            chickenQuality = scanner.nextInt();

            if (chickenQuality == 0) {
                break; // Exit condition
            }

            // Sort based on pivot
            if (chickenQuality > pivot) {
                System.out.println("Chicken " + chickenQuality + ": Acceptable");

                acceptableCodes += chickenQuality + " ";
                acceptableCount++;

            } else {
                System.out.println("Chicken " + chickenQuality + ": Unacceptable");

                unacceptableCodes += chickenQuality + " ";
                unacceptableCount++;
            }
        }

        // Final report
        System.out.println("\n--- Report ---");
        System.out.println("Pivot code: " + pivot);

        System.out.println("Acceptable codes (" + acceptableCount + "): "
                + acceptableCodes);

        System.out.println("Unacceptable codes (" + unacceptableCount + "): "
                + unacceptableCodes);

        scanner.close();
    }
}