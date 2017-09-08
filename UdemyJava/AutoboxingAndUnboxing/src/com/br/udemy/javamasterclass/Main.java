package com.br.udemy.javamasterclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //array of string
        String[] stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Value is " + (i*10);
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(i + " --> " + stringArray[i]);
        }

        //array of integer
        int[] intArray = new int[10];
        for (int i = 0; i< intArray.length; i++) {
            intArray[i] = i * 10;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + " --> " + intArray[i]);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //arrayList of string
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");
        stringArrayList.add("Andre");

        //arrayList of int (isn't possible)
        //ArrayList<int> intArrayList = new ArrayList<int>();
        //we'd have to create a class with an int element and pass it through ArrayList<intClass>

        //autoboxing - wrapping a primitive type into an object
        Integer myInteger = new Integer(54);
        Double myDouble = new Double(12.12);

        //another way to initialize
        Integer myNextInteger = 54; // Integer.valueOf(54); -- autoboxing
        int myInt = myNextInteger; // myNextInteger.intValue(); -- unboxing

        //arrayList of Integer (using the autoboxing)
        ArrayList<Integer> myIntArraList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            myIntArraList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < myIntArraList.size(); i++) {
            System.out.println(i + " --> " + myIntArraList.get(i).intValue());
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //arrayList of Double (using autoboxing)
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
            //or myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            System.out.println(i + " --> " + myDoubleValues.get(i).doubleValue());
            //or System.out.println(i + " --> " + myDoubleValues.get(i));
        }


    }
}
