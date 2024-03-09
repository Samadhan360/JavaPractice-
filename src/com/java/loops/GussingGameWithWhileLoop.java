package com.java.loops;
import java.util.Scanner;
import java.util.Random;

public class GussingGameWithWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);
        
        scanner.close();
    }
}

