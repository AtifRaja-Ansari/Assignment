package Assignment;

public class ArrayOddPosition {  
	    public static void main(String[] args) {  
	    
	       int [] arr = new int [] {7,0,0,5,8,4,3,1,1,4};   //Initialize array 
	        System.out.println("Elements on the odd position are: ");  
	        
	        for (int i = 0; i < arr.length; i = i+2) { //using for loop to locate elements on odd position 
	            System.out.println(arr[i]);  
	        }  
	   }   

}
