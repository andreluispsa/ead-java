package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is " + wasCar);

        double myFirstDoubleValue = 20d;
        double mySecondDoubleValue = 80d;
        double total = (myFirstDoubleValue + mySecondDoubleValue) * 25;
        System.out.println("Total: " + total);
        double remainder = total % 40;
        System.out.println("Remainder: " + remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");
        
        
    }
}
