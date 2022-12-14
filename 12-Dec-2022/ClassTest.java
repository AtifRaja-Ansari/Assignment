package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassTest {
	
	public static void main(String[] args) {
		// create list 1
		LinkedList<String> l = new LinkedList<String>();
		l.add("Nokia");
		l.add("Vivo");
		l.add("Oppo");
		l.add("Samsung");
		l.add("Realme");
		System.err.println("New Linked-List: " + l);

	
		// adding in a specific position
		l.add(0, "Apple");
		System.err.println("New Linked-List: " + l);
	}
}
