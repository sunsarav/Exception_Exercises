package se.lexicon;

import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

        performDivision();
        checkRange();
        withdraw();


    }

    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Exercise 1: Basic Exception Handling---");

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

    public static void checkRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---Exercise 2: Multiple Exception Types---");

        try {
            System.out.println("Enter an Integer (1 - 100): ");
            int num = scanner.nextInt();
            if (num < 1 || num > 100) {
                throw new RuntimeException("Number out of Range");
            }
            System.out.println("Valid Number: " + num);

        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear the invalid input
            System.out.println("❌ This is not a valid whole number");
        } catch (RuntimeException e) {
            System.out.println("❌" + e.getMessage());
        }

    }

    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---Exercise 3: Custom Exception---");


    }
}