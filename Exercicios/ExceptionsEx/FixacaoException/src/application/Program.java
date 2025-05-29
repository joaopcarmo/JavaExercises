package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        try {
            account.withdraw(withdrawAmount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
