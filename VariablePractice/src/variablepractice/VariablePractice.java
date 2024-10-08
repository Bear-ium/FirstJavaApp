/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variablepractice;

/**
 *
 * @author Kyle
 */
import java.util.Scanner;

public class VariablePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Single-line comment: Declare variables
        String name, surname;
        byte _age;
        char gender;
        long aliveFor;

        // Declare constant for seconds in a year
        final int secsInYear = 31536000;

        
        // Create a scanner to get user input
        Scanner s = new Scanner(System.in);

        
        // Get user name
        System.out.print("What is your name?: ");
        name = s.next();

        // Get user surname
        System.out.print("What is your surname?: ");
        surname = s.next();

        // Get user age
        System.out.print("How old are you?: ");
        _age = s.nextByte();

        // Get user gender
        System.out.print("What is your Gender?: ");
        gender = s.next().charAt(0);

        
        // Calculate aliveFor in seconds, cast to long to prevent overflow
        aliveFor = _age * secsInYear;

        
        // Display the user's information
        System.out.println("You are " + name + " " + surname + " and you are " + _age + " years old, " + "you are of Gender(" + gender + ")");
        System.out.println("You have been alive for " + aliveFor + " seconds");
        
        
        // Close the Scanner
        s.close();
    }

}
