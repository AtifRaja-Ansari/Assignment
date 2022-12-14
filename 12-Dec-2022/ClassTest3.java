package linkedlist;

import java.util.*;

public class ClassTest3 {
	
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
		
	Collections.shuffle(l);// Randomly Shuffling the elements in the list
	System.err.println(" Linked-List: " + l);//new list after shuffling the elements in the list

	}
}
