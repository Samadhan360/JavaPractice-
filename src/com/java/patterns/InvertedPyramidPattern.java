package com.java.patterns;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the height of the inverted pyramid
        
        // Print inverted pyramid pattern
        System.out.println("Inverted Pyramid Star Pattern:");
        printInvertedPyramid(rows);
    }

    // Method to print an inverted pyramid pattern of stars
    public static void printInvertedPyramid(int rows) {
        int space = 0;

        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
            space++;
        }
    }
}

