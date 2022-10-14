/*.Write a java program to illustrate Calculator class with addition, subtraction,
 multiplication methods that can take any number of parameters to perform the operation,
 without using method/constructor overloading*/

package Assignments;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		  
	int S,S1,M;
		
	Scanner in = new Scanner(System.in);
	System.out.print("Input first number: ");
	int num1 = in.nextInt();
		   
	System.out.print("Input second number: ");
	int num2 = in.nextInt();
		   
	S = num1 + num2;
	S1 = num1 - num2;
	M = num1 * num2;
		 
	System.out.println("\nSum of "+num1 + " and " + num2 + " = " +S);
	System.out.println("\nSubtraction of "+num1 + " and " + num2 + " = " +S1);
	System.out.println("\nMultiplication of "+num1 + " and " + num2 + " = " +M);

		 }
}
