package se.lexicon;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

        //performDivision();
        //checkRange();
        //withdraw();
        //readFileAndParseInts();
        performDivision1();

    }
    // Ex 1
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
    // Ex 2
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
    // Ex 3
    public static void withdraw() {
        System.out.println("\n---Exercise 3: Custom Exception---");
        BankAccount myAccount = new BankAccount();
        try {
            myAccount.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
    // Ex 4
    public static void readFileAndParseInts() {
    System.out.println("\n---Exercise 4: Nested try-catch Blocks---");
    try {
        BufferedReader reader = Files.newBufferedReader(Paths.get("numbers.txt"));

        String line;

        while ((line = reader.readLine()) != null) {
            try {
                int number = Integer.parseInt(line);
                System.out.println("Parsed Number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number: " + line);
            }
        }
    } catch (IOException e) {
        System.out.println("IO Error Occurred");
    }
    }
    // Ex 5
    public static void performDivision1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Exercise 5: finally Block---");

        try {
            System.out.println("Enter the first Number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            int result = number1 / number2;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Any number cannot be divided by 0");
        } finally {
            System.out.println("\nFinally! executes whether an exception occurs or not.");
        }
    }
    // Ex 6






}