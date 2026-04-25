
/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: D1 Introduction Code
Date: 01/13/2026
Description: A Java project used to introduce me to the class Revision History:
Revision History: 
  1/13/2026: Initial creation printing name, major, semester, plans after graduation, and a fun fact to the console.
  4/2/2026: Modified to use user answers after prompt rather than hard-coded answers.
*/

import java.util.Scanner; // Scanner Import

public class JaceEckerdtP1 { // Declaring class
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    /* Header for the program */
    System.out.println("Hello, I'm Jace!"); // My Name
    System.out.println("I am currently pursuing an A.S. in Computer Programming and Analysis."); // My major
    System.out.println("I am in my sophomore year here at HCC."); // My acedemic year
    System.out.println("I am striving to further develop my skills as the programming field becomes more competitive."); // My career goals
    System.out.println("I am originally from Texas, I moved to Florida in 2023!"); // My fun fact
    System.out.println("\n"); // Skip line

    System.out.println("Let's learn about you! It's your turn."); 
    System.out.println("\n"); // Skip line

    System.out.println("Name: "); // User's Name
        String YourName = input.nextLine(); // User input

    System.out.println("Major: "); // User's Major
        String Major = input.nextLine(); // User input

    System.out.println("Plans After Graduation: "); // User's Goals
        String Goals = input.nextLine(); // User input

    System.out.println("Fun Fact: "); // User's Fact
        String FunFact = input.nextLine(); // User input

        /* Formatting the strings into the report */
    String Report = String.format("Name: %s\nMajor: %s\nPlans After Graduation: %s\nFun Fact: %s\n", YourName, Major, Goals, FunFact);
    System.out.println("\n"); // Skip line
    System.out.printf(Report); // Prints Report

input.close(); // Closing the input for Scanner
    
  }
}
