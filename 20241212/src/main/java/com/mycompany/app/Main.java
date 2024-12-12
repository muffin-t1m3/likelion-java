package com.mycompany.app;

public class Main {
    public static void main(String[] args) {
        // Register customers and accounts.
        Bank bank = new Bank();
        bank.createCustomer("Tim");
        bank.createCustomer("Steve");
        bank.createCustomer("Mark");
        try {
            bank.createAccount("0");
            bank.createAccount("1");
            bank.createAccount("2");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Run ATM
        ATM atm = new ATM(bank);
        atm.performTransaction();
    }
}
