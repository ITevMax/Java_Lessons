package org.example;

import java.util.Random;

public class BankAccount {
    private long accountNumber;
    private final String ownerName;
    private int balance;

    public BankAccount(String ownerName, int balance) {
        accountNumber = new Random().nextLong(1, Long.MAX_VALUE);
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Баланс удачно пополнен");
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("С баланса удачно снято %d\n", amount);
        }
        else System.out.println("У вас недостаточно средств для снятия денег");
    }

    public void getBalance() {
        System.out.printf("Ваш баланс составляет %d\n", balance);
    }

    public void displayAccountInfo() {
        System.out.printf("Номер счёта: %d\n" +
                          "Владелец счёта: %s\n" +
                          "Текущий баланс: %d\n",
                          accountNumber, ownerName, balance);
    }
}