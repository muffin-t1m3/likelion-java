package com.mycompany.app;

import java.util.ArrayList;

public class Customer {
    private String id;
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}
