package com.pluralsight;

public class TestScores {
    public static void main(String[] args) {

        double testScores[] = {50.2, 100.2, 75, 95, 75, 50, 20, 50, 90, 80};

        System.out.println("Test scores: " + averageScore(testScores));

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
}
