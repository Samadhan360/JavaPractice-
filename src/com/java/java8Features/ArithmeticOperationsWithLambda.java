package com.java.java8Features;

import java.util.Scanner;

interface ArithmeticOperations {
	int operations(int num1, int num2);
}

public class ArithmeticOperationsWithLambda {
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 1st Number : ");
		 int num1 = sc.nextInt();
		 System.out.println("Enter 2nd Number : ");
		 int num2 = sc.nextInt();
		 
		 ArithmeticOperations addition = (a, b) -> a + b;
		 int result = addition.operations(num1, num2); 
		 System.out.println("Addition of "+num1+" and "+num2+" is : "+result);
		 
		 ArithmeticOperations substraction = (a, b) -> a - b;
		 int result1 = substraction.operations(num1, num2); 
		 System.out.println("Substraction of "+num1+" and "+num2+" is : "+result1);
		 
		 ArithmeticOperations multiplication = (a, b) -> a * b;
		 int result2 = multiplication.operations(num1, num2); 
		 System.out.println("Multiplication of "+num1+" and "+num2+" is : "+result2);
		 
		 ArithmeticOperations division = (a, b) -> a / b;
		 int result3 = division.operations(num1, num2); 
		 System.out.println("Division of "+num1+" and "+num2+" is : "+result3);
		 
		 ArithmeticOperations modulas = (a, b) -> a % b;
		 int result4 = modulas.operations(num1, num2); 
		 System.out.println("Modulas of "+num1+" and "+num2+" is : "+result4);
		 
	}
}
