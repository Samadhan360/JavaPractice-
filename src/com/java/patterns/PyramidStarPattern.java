package com.java.patterns;

public class PyramidStarPattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the height of the pyramid
        
        // Print pyramid pattern
        System.out.println("Pyramid Star Pattern:");
        printPyramid(rows);
    }

    // Method to print a pyramid pattern of stars
    public static void printPyramid(int rows) {
        int space = rows - 1;

        for (int i = 1; i <= rows; i++) {
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
            space--;
        }
    }
}

