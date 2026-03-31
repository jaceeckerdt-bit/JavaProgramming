/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: P7 Teaching Chickens to Drive
Date: 03/20/2026
Description: A Java project used to play games while driving
*/
import java.util.Random;
import java.util.Scanner;

public class JaceEckerdtP7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        // Header
        System.out.println("Name: Jaycee (Jace) Eckerdt");
        System.out.println("Course: COP-2800 Java Programming");
        System.out.println("Assignment: Teaching Chickens to Drive");
        System.out.println("Due Date: March 22, 2026\n");

        // Menu loop
        do {
            System.out.println("Chicken Road Trip Menu:");
            System.out.println("1. Guess the Number");
            System.out.println("2. Factorial Game");
            System.out.println("3. Matrix Game");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    guessNumberGame(input);
                    break;
                case 2:
                    factorialGame(input);
                    break;
                case 3:
                    matrixGame(input);
                    break;
                case 4:
                    System.out.println("Thanks for playing! The chickens had a great time!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }

        } while (choice != 4);

        input.close();
    }

    // Guess the Number (while loop)
    public static void guessNumberGame(Scanner input) {
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        int guess = 0;

        System.out.println("\nGuess the Number Game:");

        // while loop requirement
        while (guess != number) {
            System.out.print("Guess a number between 1 and 10: ");
            guess = input.nextInt();

            if (guess != number) {
                System.out.println("Not quite! Try again!");
            }
        }

        System.out.println("Congratulations! You guessed it! You're eggs-travagant!\n");
    }

    // Factorial Game (for loop)
    public static void factorialGame(Scanner input) {
        System.out.println("\nFactorial Game:");
        System.out.print("Enter an integer: ");

        int num = input.nextInt();
        int factorial = 1;

        // for loop requirement
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }

        if (factorial > 100) {
            System.out.println("That's a really big number!");
        }

        System.out.println();
    }

    // Matrix Game (do-while + for loop)
    public static void matrixGame(Scanner input) {
        System.out.println("\nMatrix Game:");

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int size;

        // do-while loop for validation
        do {
            System.out.print("Enter a number between 1 and 10: ");
            size = input.nextInt();

            if (size < 1 || size > 10) {
                System.out.println("Error: Number must be between 1 and 10.");
            }

        } while (size < 1 || size > 10);

        // print matrix using for loops
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        System.out.println();
    }
}