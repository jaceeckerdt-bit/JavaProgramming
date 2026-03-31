/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: P5 Cooking Breakfast
Date: 02/19/2026
Description: A Java project used to determine if the user made a healthy breakfast.
*/

import java.util.Scanner;

public class JaceEckerdtP5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Print header information
        System.out.println("Name: Jaycee (Jace) Eckerdt"); 
    System.out.println("Course: COP-2800-10968 Java Programming"); 
    System.out.println("Assignment: P5 Cooking Breakfast");      
    System.out.println("Due Date: 02/22/2026"); 
    System.out.println("\n"); // Skip line
        

        // Variables
        boolean coffee = false;
        boolean cream = false;
        boolean nonDairyCream = false;
        boolean sugar = false;
        boolean sugarSubstitute = false;

        boolean bacon = false;
        boolean canadian = false;
        boolean veganBacon = false;

        boolean eggs = false;
        String eggStyle = "";
        String friedStyle = "";

        boolean toast = false;
        boolean wheat = false;

        // Coffee
        System.out.print("Would you like coffee? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = true;

            System.out.print("Would you like cream? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                cream = true;

                System.out.print("Regular or non-dairy cream? (regular/non-dairy): ");
                if (scanner.nextLine().equalsIgnoreCase("non-dairy")) {
                    nonDairyCream = true;
                }
            }

            System.out.print("Would you like sugar? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                sugar = true;

                System.out.print("Regular sugar or sugar substitute? (regular/substitute): ");
                if (scanner.nextLine().equalsIgnoreCase("substitute")) {
                    sugarSubstitute = true;
                }
            }
        }

        // Bacon
        System.out.print("Would you like bacon? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            bacon = true;

            System.out.print("Strips or Canadian? (strips/canadian): ");
            if (scanner.nextLine().equalsIgnoreCase("canadian")) {
                canadian = true;
            }

            System.out.print("Traditional or vegan bacon? (traditional/vegan): ");
            if (scanner.nextLine().equalsIgnoreCase("vegan")) {
                veganBacon = true;
            }
        }

        // Eggs
        System.out.print("Would you like eggs? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            eggs = true;

            System.out.print("Scrambled, sunny-side-up, or fried? ");
            eggStyle = scanner.nextLine();

            if (eggStyle.equalsIgnoreCase("fried")) {
                System.out.print("Over easy, over medium, or over hard? ");
                friedStyle = scanner.nextLine();
            }
        }

        // Toast
        System.out.print("Would you like toast? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            toast = true;

            System.out.print("White or wheat? ");
            if (scanner.nextLine().equalsIgnoreCase("wheat")) {
                wheat = true;
            }
        }

        // Healthy Boolean
        boolean healthyBreakfast =
                (!coffee ||
                 (!cream && !sugar) ||
                 (nonDairyCream || sugarSubstitute))
                &&
                (!bacon || veganBacon)
                &&
                (!toast || wheat);

        // Order Summary
        System.out.println("\n Breakfast Summary:");

        if (coffee) {
            System.out.println("Coffee");
            if (cream) {
                System.out.println("- Cream (" + (nonDairyCream ? "Non-Dairy" : "Regular") + ")");
            }
            if (sugar) {
                System.out.println("- Sugar (" + (sugarSubstitute ? "Substitute" : "Regular") + ")");
            }
        } else {
            System.out.println("No Coffee");
        }

        if (bacon) {
            System.out.println("Bacon (" + (veganBacon ? "Vegan" : "Traditional") + 
                               (canadian ? ", Canadian" : ", Strips") + ")");
        } else {
            System.out.println("No Bacon");
        }

        if (eggs) {
            if (eggStyle.equalsIgnoreCase("fried")) {
                System.out.println("Eggs: Fried (" + friedStyle + ")");
            } else {
                System.out.println("Eggs: " + eggStyle);
            }
        } else {
            System.out.println("No Eggs");
        }

        if (toast) {
            System.out.println("Toast (" + (wheat ? "Wheat" : "White") + ")");
        } else {
            System.out.println("No Toast");
        }

        // Health Report
        System.out.println("\n Health Report:");
        if (healthyBreakfast) {
            System.out.println("This is considered a healthy breakfast!");
        } else {
            System.out.println("It's recommended to take a walk afterwards.");
        }

        scanner.close();
    }
}