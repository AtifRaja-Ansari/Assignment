/*.Write a java program to illustrate Calculator class with addition, subtraction,
 multiplication methods that can take any number of parameters to perform the operation,
 without using method/constructor overloading*/

package Assignments;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		  
	int sum,sub,mul;
		
	Scanner in = new Scanner(System.in);
	System.out.print("Input first number: ");
	int num1 = in.nextInt();
		   
	System.out.print("Input second number: ");
	int num2 = in.nextInt();
		   
	sum = num1 + num2;
	sub = num1 - num2;
	mul = num1 * num2;
		 
	System.out.println("\nSum of "+num1 + " and " + num2 + " = " +sum);
	System.out.println("\nSubtraction of "+num1 + " and " + num2 + " = " +sub);
	System.out.println("\nMultiplication of "+num1 + " and " + num2 + " = " +mul);

		 }
}
