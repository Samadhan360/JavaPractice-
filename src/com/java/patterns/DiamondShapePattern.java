package com.java.patterns;

public class DiamondShapePattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the size of the diamond
        
        // Print diamond pattern
        System.out.println("Diamond Shape Star Pattern:");
        printDiamond(rows);
    }

    // Method to print a diamond shape pattern of stars
    public static void printDiamond(int rows) {
        int space = rows - 1;

        // Print upper half of the diamond
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

        space = 1;

        // Print lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
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

