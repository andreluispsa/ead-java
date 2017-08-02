package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Number was 1");
                break;
            case 2:
                System.out.println("Number was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Number was " + switchValue);
                break;
            default:
                System.out.println("Number was not 1 or 2 or 3 or 4 or 5");
                break;
        }

        String month = "FeBruary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Month was jan");
                break;
            case "february":
                System.out.println("Month was fev");
                break;
            case "july":
                System.out.println("Month was jul");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
