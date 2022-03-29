package com.Account;


abstract class BankAccount {
    private int accNum;
    private String accHolderName;
    private double accBalance;

    public BankAccount(int accNum, String accHolderName, double accBalance) {
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public void showBalance() {
        System.out.println("Balance is: " + this.accBalance);
    }

    abstract double withdraw(double amount);

    abstract double deposit(double amount);

    @Override
    public String toString() {
        return "BankAccount [accBalance=" + accBalance + ", accHolderName=" + accHolderName + ", accNum=" + accNum
                + "]";
    }

}