package org.example;

public class Main {
    static void main() {
        var myBankAccount = new BankAccount("Maxim");
        myBankAccount.deposit(3200);
        myBankAccount.getBalance();
        myBankAccount.withdraw(1000);
        myBankAccount.withdraw(2000);
        myBankAccount.withdraw(500);
        myBankAccount.getBalance();
        myBankAccount.displayAccountInfo();
    }
}