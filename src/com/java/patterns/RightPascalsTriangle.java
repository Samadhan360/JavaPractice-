package com.java.patterns;

public class RightPascalsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the number of rows in the triangle
        
        // Print Right Pascal's Triangle
        System.out.println("Right Pascal's Triangle:");
        printRightPascalsTriangle(rows);
    }

    // Method to print Right Pascal's Triangle
    public static void printRightPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = i; k < rows; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}

