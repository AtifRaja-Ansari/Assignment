package linkedlist;

import java.util.*;

public class ClassTest2 {
	
	public static void main(String[] args) {
		// create list 1
		LinkedList<String> l = new LinkedList<String>();
		l.add("Nokia");
		l.add("Vivo");
		l.add("Oppo");
		l.add("Samsung");
		l.add("Realme");
		l.add("Redme");
	System.err.println(" Linked-List: " + l);// first list
		
	Collections.swap(l, 0, 2);// Swamping a specific element in the list
	System.err.println(" Linked-List: " + l);// new list after swamping the elements

	}
}
