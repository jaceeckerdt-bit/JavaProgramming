/*
Name: Jaycee (Jace) Eckerdt 
Course: COP-2800-10968 Java Programming 
Assignment: P9 The Chicken Hotline
Date: 04/09/2026
Description: A Java project used to convert alphanumeric phone numbers to digits.
*/

import java.util.Scanner;

public class JaceEckerdtP9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphanumeric phone number: ");
        String userInput = input.nextLine();

        if (!isValidInput(userInput)) {
            System.out.println("Invalid input. Only letters, numbers, and dashes are allowed, and length must be valid.");
        } else {
            String result = convertPhoneNumber(userInput);
            System.out.println("Converted phone number: " + result);
        
        input.close();
        }
}


    // Validate input
    public static boolean isValidInput(String input) {

        // Length check 
        if (input.length() < 7 || input.length() > 15) {
            return false;
        }

        // Check valid characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (!(Character.isLetter(c) || Character.isDigit(c) || c == '-')) {
                return false;
            }
        }

        return true;
    }

    // Convert letters to digits
    public static String convertPhoneNumber(String input) {

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toUpperCase(input.charAt(i));

            if (Character.isDigit(c) || c == '-') {
                result += c;
            } else {
                result += letterToNumber(c);
            }
        }

        return result;
    }

    // Map letters to keypad numbers
    public static char letterToNumber(char c) {

        if ("ABC".indexOf(c) != -1) return '2';
        if ("DEF".indexOf(c) != -1) return '3';
        if ("GHI".indexOf(c) != -1) return '4';
        if ("JKL".indexOf(c) != -1) return '5';
        if ("MNO".indexOf(c) != -1) return '6';
        if ("PQRS".indexOf(c) != -1) return '7';
        if ("TUV".indexOf(c) != -1) return '8';
        if ("WXYZ".indexOf(c) != -1) return '9';

        return '0'; // fallback (should not happen)
    }
}