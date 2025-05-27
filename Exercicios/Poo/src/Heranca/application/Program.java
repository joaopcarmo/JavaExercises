package Heranca.application;

import Heranca.entities.Account;
import Heranca.entities.BusinessAccount;
import Heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, 1000.0, "Alex");
        Account acc2 = new SavingsAccount(1002, 1000.0, "Maria", 0.01);
        Account acc3 = new BusinessAccount(1003, 1000.0, "Bob", 500.0);

        System.out.println("=== BEFORE WITHDRAW ===");
        System.out.println("Account: " + acc1.getBalance());
        System.out.println("Savings: " + acc2.getBalance());
        System.out.println("Business: " + acc3.getBalance());

        acc1.withdraw(200.0);
        acc2.withdraw(200.0);
        acc3.withdraw(200.0);

        System.out.println("\n=== AFTER WITHDRAW ===");
        System.out.println("Account: " + acc1.getBalance()); // -205
        System.out.println("Savings: " + acc2.getBalance()); // -200
        System.out.println("Business: " + acc3.getBalance()); // -207

        // Downcasting
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bacc = (BusinessAccount) acc3;
            bacc.loan(100.0);
            System.out.println("\nLoan made. New balance: " + bacc.getBalance());
        }

        if (acc2 instanceof SavingsAccount) {
            SavingsAccount sacc = (SavingsAccount) acc2;
            sacc.updateBalance();
            System.out.println("Interest added. New balance: " + sacc.getBalance());
        }
    }
}