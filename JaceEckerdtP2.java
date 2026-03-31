/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: D2 The Chicken Coop
Date: 01/13/2026
Description: A Java project used to introduce me to the class
*/
import java.util.Scanner; // Scanner Import

public class JaceEckerdtP2 { // Declaring class
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    /* Header for the program */
    System.out.println("Name: Jaycee (Jace) Eckerdt"); 
    System.out.println("Course: COP-2800-10968 Java Programming"); 
    System.out.println("Assignment: P2 The Chicken Coop");      
    System.out.println("Due Date: 01/25/2026"); 
    System.out.println("\n"); // Skip line
    System.out.println("What is the name of your farm?"); // Question 1

        String farmName = input.nextLine(); // Users input

    System.out.println("How many chickens will you have?"); // Question 2

        String chickenAmount = input.next(); // Users input

    System.out.println("How many eggs do you hope for each day?");

        String eggAmount = input.next(); // Users input

    System.out.println("What is your budget, in dollar amount, for the coop?");

        String budgetAmount = input.next(); // Users input

    System.out.println("What color do you want the coop to be?");

        String coopColor = input.next(); // Users input

        /* Formatting the strings into the report */
    String formattedString = String.format("Welcome to %s! Here, we have %s chickens residing with us at our poultry farm. We gather %s eggs from our laying hens daily. We started this farm with a budget of %s dollars and we painted the coop %s because it makes our chickens happy!", farmName, chickenAmount, eggAmount, budgetAmount, coopColor);

System.out.printf(formattedString); // Prints Report

input.close(); // Closing the input for Scanner
    
  }
}
