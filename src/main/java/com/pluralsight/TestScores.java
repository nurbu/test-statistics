package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double testScores[] = new double[10];

        System.out.println("Enter the number of test scores: ");
        for (int i = 0; i < testScores.length; i++) {
            int score = scanner.nextInt();
            testScores[i] = score;
        }

        System.out.println("Current Scores: ");
        for (int i = 0; i < testScores.length; i++) {
            System.out.println("Score " + (i + 1) + " :" + testScores[i]);
        }


        System.out.printf("\nAverage Score: %.2f\n", averageScore(testScores));
        System.out.println("High score: " + highScore(testScores));
        System.out.println("Low score: " + lowScore(testScores));
        System.out.println("Median score: " + median(testScores));
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

    // Calculates the median
    public static double median(double testScores[]) {
        Arrays.sort(testScores);

        int middle1 = testScores.length / 2;
        int middle2 = middle1 + 1;
        double median = testScores[((middle1 + middle2) / 2)];


        return median;
    }
}
