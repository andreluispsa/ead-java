package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        double amount = 14234.00;
        for (int i=1; i <= 10; i++) {
            System.out.println(amount + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(amount, i)));
        }

        System.out.println("------------------------");

        for (int i=10; i >= 1; i--) {
            System.out.println(amount + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(amount, i)));
        }

        int num = 11;
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

        System.out.println("------------------------");

        int count = 0;
        for (int i = 50; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
                count++;
            }
            if (count == 3) {
                break;
            }
        }

    }

    private static double calculateInterest(double amount, double interestRate) {
            return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

//        for (int i=2; i <= n/2; i++) {
        for (int i=2; i <= (long) Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
