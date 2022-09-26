/WAP to check leap year
import java.util.*;
public class asgn8{
	public static void main(String[] args)   
	{  
		Scanner sc= new Scanner(System.in); 
		System.out.print("enter any year: ");  
		int y= sc.nextInt(); 
	
		if (y % 400 == 0) {
			System.out.println(y + " is a leap year.");
		} else if (y % 100 == 0) {
			System.out.println(y + " is not a leap year.");
		} else if (y % 4 == 0) {
			System.out.println(y + " is a leap year.");
		} else {
			System.out.println(y + " is not a leap year.");
		}
}

}