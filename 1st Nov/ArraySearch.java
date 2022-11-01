package Assignment;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		int[] N1 = {9,8,7,3,2,1};
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter the Number to look for: ");
	    int x = in.nextInt();
     	boolean b = false;
		for(int n : N1) {
			if (n == x) {
				b = true;
				System.out.println(x+ " - is present in the array");
				break;
			}
		}
		if(b==false)
			System.out.println(x+ " - is not present in the array);");
		
	}
	
}
