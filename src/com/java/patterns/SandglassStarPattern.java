package com.java.patterns;

public class SandglassStarPattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the size of the sandglass

        // Print sandglass pattern
        System.out.println("Sandglass Star Pattern:");
        printSandglass(rows);
    }

    // Method to print a sandglass pattern of stars
    public static void printSandglass(int rows) {
        printUpwardTriangle(rows);
        printDownwardTriangle(rows);
    }

    // Method to print an upward triangle pattern of stars
    public static void printUpwardTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print a downward triangle pattern of stars
    public static void printDownwardTriangle(int rows) {
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < rows - i - 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (i + 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

