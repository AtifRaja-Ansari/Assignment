package Assignment;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		//Taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the investment amount");
		double amount=sc.nextDouble();
		System.out.println("Input the rate of interest");
		double rate=sc.nextDouble();
		System.out.println("Input number of years");
		int year=sc.nextInt();
		
		
		double SI;//SI--->Simple Interest
		
		SI=(amount*rate*year)/100;//	using Simple Interest Formula
		
		System.out.println("The simple interest is"+SI);// printing the output
	}

}
