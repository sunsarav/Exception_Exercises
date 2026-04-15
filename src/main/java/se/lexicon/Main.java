package se.lexicon;

import java.util.Scanner;

public class Main {
    static void main() {
        //Ex1 - Write a program that asks the user to input two integers and then divides the first number by the second.
        //Implement exception handling to manage the scenario where the user inputs zero as the second number.
        //Use try-catch to handle ArithmeticException.

        System.out.println("---Exercise 1: Basic Exception Handling---");

        performDivision();


    }
    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first Number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            int result = number1 / number2;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Any number cannot be divided by 0");

        }


    }

}
