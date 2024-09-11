package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine(); // Limpeza de buffer após o nextInt()
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char depositInitial = sc.next().charAt(0);
        if (depositInitial == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositInitialValue = sc.nextDouble();
            account = new Account(number, holder, depositInitialValue);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("\nAccount data: ");
        System.out.printf(account.toString());
        System.out.println();
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.printf(account.toString());
        System.out.println();
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.printf(account.toString());

        sc.close();
    }
}
