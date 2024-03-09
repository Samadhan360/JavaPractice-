package com.java.loops;
import java.util.Scanner;
public class PalindromeWithWhileLoop {
 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        String reversed = "";
	        int length = input.length();
	        int i = length - 1;
	        
	        while (i >= 0) {
	            reversed += input.charAt(i);
	            i--;
	        }
	        
	        if (input.equals(reversed)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	        scanner.close();
	    }
	}

