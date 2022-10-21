/*Write a Java program that reads in two floating-point 
numbers and tests whether they are the same up to 
three decimal places.*/

package Assignment;
import java.util.Scanner;

public class Floating_points {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two floating point number:");
		float a=sc.nextFloat();
		System.out.print("Enter two floating point number:");
		float b=sc.nextFloat();
		a=(float) (Math.round(a*Math.pow(10,3))/Math.pow(10,3));
		b=(float) (Math.round(b*Math.pow(10,3))/Math.pow(10,3));
		if(a==b)
			System.out.println("The number are same up to three decimal places.");
			else
			System.out.println("The number are not the same.");
		}
	}
