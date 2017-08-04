package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();

        account.setCustomerName("André Sá");
        account.setCustomerEmail("andrepena.sa@gmail.com");
        account.setCustomerPhone("21-97977-3888");
        account.setBalance(2500.00);
        account.setNumber(132443);

        System.out.println("Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getCustomerEmail());
        System.out.println("Phone: " + account.getCustomerPhone());
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Account Balance: " + account.getBalance());

        account.deposit(250.00);
        account.deposit(120.00);
        account.withdraw(20.00);
        account.withdraw(3000.00);

        System.out.println("New Account Balance: " + account.getBalance());
    }
}
