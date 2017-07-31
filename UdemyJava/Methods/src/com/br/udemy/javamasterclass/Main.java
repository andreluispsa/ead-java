package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        calculateAndPrintScore(true, 800, 5, 100);

        calculateAndPrintScore(true, 10000, 8, 200);

        System.out.println("Your final score is: " + calculateScore(true, 1500, 5, 100));

        System.out.println("Your final score is: " + calculateScore(false, 1500, 5, 100));

    }

    public static void calculateAndPrintScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
