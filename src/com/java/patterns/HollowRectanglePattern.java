package com.java.patterns;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the height of the rectangle
        int cols = 8; // Change this value to adjust the width of the rectangle
        
        // Print hollow rectangle pattern
        System.out.println("Hollow Rectangle Star Pattern:");
        printHollowRectangle(rows, cols);
    }

    // Method to print a hollow rectangle pattern of stars
    public static void printHollowRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print stars if it's the first or last row, or first or last column
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}

