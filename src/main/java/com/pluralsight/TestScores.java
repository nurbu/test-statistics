package com.pluralsight;

public class TestScores {
    public static void main(String[] args) {

        double testScores[] = {50.2, 100.2, 75, 95, 75, 50, 20, 50, 90, 80};

        System.out.printf("Average Score: %.2f\n", averageScore(testScores));
        System.out.println("High score: " + highScore(testScores));
        System.out.println("Low score: " + lowScore(testScores));

    }

    // Calculates average

    public static double averageScore(double testScores[]) {

        double totalScore = 0;

        for (int i = 0; i < testScores.length; i++) {
            totalScore += testScores[i];
        }

        double average = totalScore / testScores.length;

        return average;
    }

    // Calculates high score

    public static double highScore(double testScores[]) {
        double highScore = testScores[0];
        for (int i = 1; i < testScores.length; i++) {
            if (testScores[i] > highScore) {
                highScore = testScores[i];
            }
        }
        return highScore;
    }

    // calculates lowest score
    public static double lowScore(double testScores[]) {
        double lowScore = testScores[0];
        for (int i = 1; i < testScores.length; i++) {
            if (testScores[i] < lowScore) {
                lowScore = testScores[i];
            }
        }
        return lowScore;
    }
}
