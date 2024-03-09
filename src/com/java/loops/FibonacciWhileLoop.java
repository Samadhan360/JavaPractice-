package com.java.loops;
import java.util.Scanner;

public class FibonacciWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        
        int num1 = 0, num2 = 1, nextTerm = 0;
        
        System.out.println("Fibonacci Series up to " + limit + " terms:");
        
        int count = 0;
        while (num1 <= limit) {
            if (count <= 1) {
                nextTerm = count;
            } else {
                nextTerm = num1 + num2;
                num1 = num2;
                num2 = nextTerm;
            }
            System.out.print(nextTerm + " ");
            count++;
        }
        scanner.close();
    }
}
