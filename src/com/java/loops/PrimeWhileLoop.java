package com.java.loops;

import java.util.Scanner;

public class PrimeWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        int i = 2;
        
        while (i <= number / 2) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}
