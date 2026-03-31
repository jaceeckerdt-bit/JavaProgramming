/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: P3 Eggs Every Day
Date: 01/30/2026
Description: A Java project used create an estimated number of eggs that will be produced on the farm.
*/

import java.util.Scanner; // Scanner Import

public class JaceEckerdtP3 { // Declaring class
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    /* Header for the program */
    System.out.println("Name: Jaycee (Jace) Eckerdt"); 
    System.out.println("Course: COP-2800-10968 Java Programming"); 
    System.out.println("Assignment: P3 Eggs Every Day");      
    System.out.println("Due Date: 02/01/2026"); 
    System.out.println("\n"); // Skip line
    System.out.println("How many chickens are on the farm?"); // Question 1

        String totalChickens = input.nextLine(); // Users input

            // Using Integer.parseInt to convert the string to a integer
            int chickens = Integer.parseInt(totalChickens);

    System.out.println("How many of those are roosters?"); // Question 2

        String totalRoosters = input.next(); // Users input

            // Using Integer.parseInt to convert the string to a integer
            int roosters = Integer.parseInt(totalRoosters);

    System.out.println("What is the percentage chance that a chicken lays an egg in a day?");

        String percentageChance = input.next(); // Users input

         // Using Float.parseFloat() to convert the string to a float primitive
            float chance = Float.parseFloat(percentageChance);

    System.out.println("What is the number of days?");

        String totalDays = input.next(); // Users input

          // Using Integer.parseInt to convert the string to a integer
            int days = Integer.parseInt(totalDays);

        // Prints Calculation
    System.out.println("Here is an estimated number of eggs that will be produced on the farm:");

        /* The calculation: 
        (number of chickens – number of roosters) * (percentage chance of laying an egg) * (number of days). 
        Note that the percentage chance is a value between 0.0 and 1.0. */

    System.out.print((chickens - roosters) * (chance) * (days));

input.close(); // Closing the input for Scanner
    
  }
}