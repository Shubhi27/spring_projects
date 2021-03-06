package com.Account;

class SalaryAccount extends BankAccount {

    SalaryAccount(int accNum, String accHolderName, float accBalance) {
        super(accNum, accHolderName, accBalance);
    }

    double balance = getAccBalance();

    @Override
    public double withdraw(double amount) {

        if (amount > balance && amount <= 100000) {
            System.out.println("Cannot withdraw more than account balance");
        } else {
            balance -= amount;
        }
        return balance;
    }

    @Override
    public double deposit(double amount) {

        balance += amount;

        return balance;
    }
}
