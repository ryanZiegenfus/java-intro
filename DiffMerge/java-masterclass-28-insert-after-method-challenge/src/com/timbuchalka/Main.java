package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("High score: " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("High score: " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int place) {
        System.out.println(name + " managed to get into position " + place + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        }else if(score > 100) {
            return 3;
        }
        return 4;
    }
}
