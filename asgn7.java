//WAP to check a prime number.
import java. util.*;
//import java. lang.*;
public class asgn7{

  public static void main(String[] args) {

    int n = 3;
    int count = 0;
     if (n <= 1)
	    count++;
    for (int i = 2; i <= n / 2; i++) {
      
      if (n % i == 0) {
        count++;
      }
    }

    if ( count > 0)
      System. out.println("The number is not prime");
    else
      System. out.println("The number is prime");
  }
}