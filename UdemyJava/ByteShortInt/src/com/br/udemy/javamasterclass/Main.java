package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        // casting
        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println("myNewShortValue: " + myNewShortValue);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        // casting
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue: " + myNewByteValue);



    }
}
