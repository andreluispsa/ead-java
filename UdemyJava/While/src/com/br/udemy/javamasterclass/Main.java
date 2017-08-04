package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("--------------------------------------");
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("--------------------------------------");
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        System.out.println("--------------------------------------");

        int number = 5;
        int finishNumber = 20;
        int totalNumberFound = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            } else {
                System.out.println("Number " + number + " is even");
                number++;
                totalNumberFound++;
                if (totalNumberFound >= 5) {
                    break;
                }
            }
        }
        System.out.println("Total Even Numbers Found: " + totalNumberFound);

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
