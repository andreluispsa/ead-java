package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(132443, 2500.00, "André Sá", "andrepena.sa@gmail.com", "21-9797-73888");

//        account.setCustomerName("André Sá");
//        account.setCustomerEmail("andrepena.sa@gmail.com");
//        account.setCustomerPhone("21-97977-3888");
//        account.setBalance(2500.00);
//        account.setNumber(132443);

        System.out.println("Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getCustomerEmail());
        System.out.println("Phone: " + account.getCustomerPhone());
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Account Balance: " + account.getBalance());

        account.deposit(250.00);
        account.deposit(120.00);
        account.withdraw(20.00);
        account.withdraw(3000.00);

        System.out.println("Account New Balance: " + account.getBalance());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Account newAccount = new Account();
        System.out.println("Name: " + newAccount.getCustomerName());
        System.out.println("Email: " + newAccount.getCustomerEmail());
        System.out.println("Phone: " + newAccount.getCustomerPhone());
        System.out.println("Account Number: " + newAccount.getNumber());
        System.out.println("Account Balance: " + newAccount.getBalance());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Account newAccount2 = new Account("Ellen Moraes", "ellen@gmail.com", "21-97977-3888");
        System.out.println("Name: " + newAccount2.getCustomerName());
        System.out.println("Email: " + newAccount2.getCustomerEmail());
        System.out.println("Phone: " + newAccount2.getCustomerPhone());
        System.out.println("Account Number: " + newAccount2.getNumber());
        System.out.println("Account Balance: " + newAccount2.getBalance());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        VipCustomer customer1 = new VipCustomer();
        System.out.println("Vip Customer 1 Name: " + customer1.getName());
        System.out.println("Vip Customer 1 Email: " + customer1.getEmail());
        System.out.println("Vip Customer 1 Credit Limit: " + customer1.getCreditLimit());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        VipCustomer customer2 = new VipCustomer("André Sá", 1500.00);
        System.out.println("Vip Customer 2 Name: " + customer2.getName());
        System.out.println("Vip Customer 2 Email: " + customer2.getEmail());
        System.out.println("Vip Customer 2 Credit Limit: " + customer2.getCreditLimit());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        VipCustomer customer3 = new VipCustomer("Ellen Moraes", 1750.00, "ellen@email.com");
        System.out.println("Vip Customer 1 Name: " + customer3.getName());
        System.out.println("Vip Customer 1 Email: " + customer3.getEmail());
        System.out.println("Vip Customer 1 Credit Limit: " + customer3.getCreditLimit());

    }
}
