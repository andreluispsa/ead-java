package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes) -- default for non-decimal
        int myIntValue = 5 / 3;

        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // width of double = 64 (8 bytes) -- default for decimal
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        double numPounds = 5d;
        double numKilograms = numPounds * 0.45359237d;

        System.out.println(numPounds + " Pounds is equal to " + numKilograms + " Kilograms");

    }
}
