package com.java.java8Features;

import java.util.Scanner;

interface TextOperations {
	String operations(String name);
}

public class StringOperations {
	public static void main(String [] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any string : ");
		 String name = sc.nextLine();
		 
		 TextOperations upperCase = (text) -> text.toUpperCase();
		 String result = upperCase.operations(name); 
		 System.out.println(name+" String in uppercase -> "+result);
		 
		 TextOperations lowerCase = (text) -> text.toLowerCase();
		 String result1 = lowerCase.operations(name);
		 System.out.println(name+" String in lowercase -> "+result1);
		 
		 TextOperations reverseString = (text) -> {
			 StringBuilder reversed = new StringBuilder(text);
			return reversed.reverse().toString();
		 };
		 String result2 = reverseString.operations(name);
		 System.out.println(name+" String in lowercase -> "+result2);
	}
}
