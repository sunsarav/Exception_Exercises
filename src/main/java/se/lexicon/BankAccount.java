package se.lexicon;

import java.util.Scanner;

public class BankAccount {
    private double balance = 1000.0;


public void withdraw(double amount) throws InsufficientBalanceException {
    if (amount > balance) {
        throw new InsufficientBalanceException("Balance is too low! Current Balance: " + balance);

    }
}
}

