/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vars;

/**
 *
 * @author Kyle
 */
import java.util.Scanner;                               // Importing the Scanner Library

public class Vars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;                                    // Declaring variable
        byte _age;
        char gender;

        Scanner s = new Scanner(System.in);       // Creating an object s of type Scanner(class)

        System.out.print("What is your name?: ");        // Asking for Input
        name = s.next();                                   // Read a string

        System.out.println("Your name is: " + name);       // Giving an OutPut

        System.out.print("What is your age?: ");        // Asking for Input
        _age = s.nextByte();                              // Read a string

        System.out.println("Your age is: " + _age);       // Giving an OutPut

        System.out.print("What is your gender?: ");     // Asking for Input
        gender = s.next().charAt(0);                 // Read a char

        System.out.println("Your gender is: " + gender);  // Giving an OutPut
        
        System.out.println("Your name is " + name + " and you are " + _age + " years old! You are also Gender(" + gender + ")");
        //s.nextLine();                                   // To read the whole line
        
        
        s.close();
    }
}
