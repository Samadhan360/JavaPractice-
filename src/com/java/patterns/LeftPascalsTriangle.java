package com.java.patterns;

public class LeftPascalsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the number of rows in the triangle
        
        // Print Left Pascal's Triangle
        System.out.println("Left Pascal's Triangle:");
        printLeftPascalsTriangle(rows);
    }

    // Method to print Left Pascal's Triangle
    public static void printLeftPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

