/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: D4 Exploring the API
Date: 01/13/2026
Description: A short program that uses at least two mathematical methods
*/

public class mathProgram {
public static void main(String[] args) {

// Establishes an integer value for variables
int a = 5;
int b = 2;
int c = 7;
int d = 4;

// "x" variable is equal to the sum of a and b
int x = Math.addExact(a,b);

// Prints to the screen multiplication
int result = Math.multiplyExact(c,d);
System.out.println(c + " multiplied by " + d + " is " + result);

// Prints to screen addition
System.out.println("5 plus 2 equals " + x);
    }
}