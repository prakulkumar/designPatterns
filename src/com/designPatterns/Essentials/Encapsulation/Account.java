package com.designPatterns.Essentials.Encapsulation;

public class Account {
    private int balance;

    public void deposite(int amount) {
        balance += amount;
    }

    public void withdrawl(int amount) {
        balance -= amount;
    }

    public void setBalance(int amount) {
        balance = amount;
    }

    public int getBalance() {
        return balance;
    }
}
