package com.mycompany.app;

import java.util.ArrayList;
import java.util.Random;
import com.mycompany.app.exceptions.AccountNotFoundException;
import com.mycompany.app.exceptions.BankOperationException;

public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<Customer> customers;

    public Bank() {
        accounts = new ArrayList<>();
        customers = new ArrayList<>();
    }

    int maximumAccountNumberForEachPerson = 3;

    void createCustomer(String ownerName) {
        String id = Integer.toString(customers.size());
        customers.add(new Customer(id, ownerName));
    }

    void createAccount(String ownerId) throws BankOperationException {
        // Ensure that each person has a maximum of three accounts.
        int foundAccountNumber = 0;
        for (Account account : accounts) {
            if (account.getOwnerId().equals(ownerId)) {
                foundAccountNumber++;
            }
        }
        if (foundAccountNumber > maximumAccountNumberForEachPerson) {
            throw new BankOperationException(
                    "Each person is allowed to have a maximum of three accounts.");
        }

        // Generate a new account id.
        String accountId = null;
        boolean isAlreadyExisting = false;
        do {
            Random random = new Random();
            int randomNumber = 1000000 + random.nextInt(9000000);
            accountId = Integer.toString(randomNumber);

            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getId() == accountId) {
                    isAlreadyExisting = true;
                }
            }
        } while (accountId == null || isAlreadyExisting);

        // Create an account.
        boolean isCreationSuccessful = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(ownerId)) {
                accounts.add(new Account(accountId, ownerId));
                isCreationSuccessful = true;
            }
        }
        if (!isCreationSuccessful) {
            throw new BankOperationException("Customer not found!");
        }
    }

    void checkBalance(String targetId) {
        try {
            System.out.println(findAndGetAccount(targetId).getBalance());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    Customer findAndGetCustomer(String targetId) throws BankOperationException {
        for (Customer customer : customers) {
            if (customer.getId().equals(targetId)) {
                return customer;
            }
        }
        throw new BankOperationException("Customer not found!");
    }

    Account findAndGetAccount(String targetId) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account.getId().equals(targetId)) {
                return account;
            }
        }
        throw new AccountNotFoundException("Customer not found!");
    }

    void listAccounts(String ownerId) {
        for (Account account : accounts) {
            if (ownerId == null) {
                System.out.println(account);
            } else if (account.getOwnerId().equals(ownerId)) {
                System.out.println(account);
            }
        }
    }

    void listCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
