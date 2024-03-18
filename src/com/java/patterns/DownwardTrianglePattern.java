package com.java.patterns;

public class DownwardTrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the size of the triangle
        
        // Print downward triangle pattern
        System.out.println("Downward Triangle Star Pattern:");
        printDownwardTriangle(rows);
    }

    // Method to print a downward triangle pattern of stars
    public static void printDownwardTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

