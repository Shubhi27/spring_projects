package com.Account;

class SavingsAccount extends BankAccount {

    SavingsAccount(int accNum, String accHolderName, double accBalance) {
        super(accNum, accHolderName, accBalance);
    }

    double balance = getAccBalance();

    @Override
    public double withdraw(double amount) {

        if (amount > balance && amount <= 300000) {
            System.out.println("Cannot withdraw more than account balance");
        } else {
            balance -= amount;
        }
        return balance;
    }

    @Override
    public double deposit(double amount) {
        if (amount > 1000000) {
            System.out.println("Amount exceeded the limit");
        } else {
            balance += amount;

        }
        return balance;
    }

    @Override
    public String toString() {
        return super.toString() + "SavingsAccount [balance=" + balance + "]";
    }

}