package com.br.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        calculateAndPrintScore(true, 800, 5, 100);

        calculateAndPrintScore(true, 10000, 8, 200);

        int highScore = calculateScore(true, 1500, 5, 100);

        System.out.println("Your final score is: " + highScore);

        highScore = calculateScore(false, 1500, 5, 100);

        System.out.println("Your final score is: " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Andre", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ellen", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Luiza", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Alice", highScorePosition);

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

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
