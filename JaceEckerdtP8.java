/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: P8 Taking Your Chickens on Vacation
Date: 04/02/2026
Description: A Java project used to calculate number of eggs
*/
import java.util.Scanner;

public class JaceEckerdtP8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Header
        System.out.println("Name: Jaycee (Jace) Eckerdt");
        System.out.println("Course: COP-2800 Java Programming");
        System.out.println("Assignment: Chicken Egg Counter Project");
        System.out.println("Due Date: April 2, 2026\n");

        // Get validated number of chickens
        int numChickens = getValidChickens(input);

        // Get validated number of weeks
        int numWeeks = getValidWeeks(input);

        // Create arrays
        String[][] chickens = new String[numChickens][2]; // [name][color]
        int[][] eggs = new int[numWeeks][numChickens];   // [week][chicken]

        // Collect chicken info
        getChickenInfo(input, chickens);

        // Collect egg production
        getEggData(input, chickens, eggs);

        // Print report
        printReport(chickens, eggs, numWeeks);

        input.close();
    }

    // Method: Validate number of chickens
    public static int getValidChickens(Scanner input) {
        int num;

        do {
            System.out.print("Enter number of chickens (1-10): ");
            num = input.nextInt();
            input.nextLine();

            if (num < 1 || num > 10) {
                System.out.println("Error: Must be between 1 and 10.");
            }

        } while (num < 1 || num > 10);

        return num;
    }

    // Method: Validate number of weeks
    public static int getValidWeeks(Scanner input) {
        int num;

        do {
            System.out.print("Enter number of weeks (at least 1): ");
            num = input.nextInt();
            input.nextLine();

            if (num < 1) {
                System.out.println("Error: Must be at least 1 week.");
            }

        } while (num < 1);

        return num;
    }

    // Method: Get chicken names and colors
    public static void getChickenInfo(Scanner input, String[][] chickens) {

        for (int i = 0; i < chickens.length; i++) {
            System.out.print("Enter name for chicken " + (i + 1) + ": ");
            chickens[i][0] = input.nextLine();

            System.out.print("Enter color for chicken " + (i + 1) + ": ");
            chickens[i][1] = input.nextLine();
        }
    }

    // Method: Get egg production
    public static void getEggData(Scanner input, String[][] chickens, int[][] eggs) {

        for (int c = 0; c < chickens.length; c++) {
            String name = chickens[c][0];

            for (int w = 0; w < eggs.length; w++) {
                System.out.print("How many eggs did " + name + " produce in week " + (w + 1) + "? ");
                eggs[w][c] = input.nextInt();
            }
        }
    }

    // Method: Print report
    public static void printReport(String[][] chickens, int[][] eggs, int weeks) {

        System.out.println("\nEgg Production Report:");

        for (int c = 0; c < chickens.length; c++) {

            String name = chickens[c][0];
            String color = chickens[c][1];
            int total = 0;

            // Sum eggs for this chicken
            for (int w = 0; w < eggs.length; w++) {
                total += eggs[w][c];
            }

            System.out.println(name + " the " + color + " chicken produced " 
                + total + " eggs in " + weeks + " weeks.");
        }
    }
}