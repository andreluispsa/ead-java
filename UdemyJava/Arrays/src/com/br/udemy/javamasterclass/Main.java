package com.br.udemy.javamasterclass;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /* Array with 10 positions - from 0 to 9 */
        int[] myIntArray = new int[10];
        /* Assigning 50 to position 4 */
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[5];
        System.out.println(myIntArray[5]);

        /* Defining an array and assigning values to it */
        int[] mySecondIntArray = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(mySecondIntArray[5]);

        int[] myThirdIntArray = new int[10];
        for (int i=0; i < myThirdIntArray.length; i++) {
            myThirdIntArray[i] = i*10;
        }
        System.out.println(myThirdIntArray[9]);
        System.out.println(myThirdIntArray.length);
        printArray(myThirdIntArray);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
        System.out.println("The sum of the values is " + getSum(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i=0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
