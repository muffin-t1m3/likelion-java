package com.mycompany.app;

public class Account {
    private String id;
    private double balance;
    private String ownerId;

    public Account(String id, String ownerId) {
        this.id = id;
        this.balance = 0;
        this.ownerId = ownerId;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerId() {
        return ownerId;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", ownerId=" + ownerId + "]";
    }
}
