/*Write a program in Java to display the cube of the number
 upto given an integer..*/

package Assignment;
import java.util.Scanner;

public class Cube_till_nth_term {
	public static void main(String[] args) {
	    int i,n,c;
	    
	    System.out.print("Enter the nth digit : ");//taking input from user
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();

//using for loop
	     for(i=1;i<=n;i++)
	     {
	    	 c = i*i*i;//calculating cube
	     System.out.println("cube of " +i+" is : "+c);     
	    }
	 }

}
