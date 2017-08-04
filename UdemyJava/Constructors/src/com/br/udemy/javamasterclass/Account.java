package com.br.udemy.javamasterclass;

public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void deposit(double value) {
        this.balance += value;
        System.out.println("Deposit of " + value + " made. New balance is: " + this.balance);
    }

    public void withdraw(double value) {
        if ((this.balance - value) >= 0) {
            this.balance -= value;
            System.out.println("Withdraw of " + value + " processed. Remaining balance: " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdraw not processed.");
        }
    }

}
