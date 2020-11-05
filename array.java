
package array;

import java.io.*; 
import java.util.*; 

class Array{ 

	public static void main(String[] args) 
	{ 

		// Declaring an ArrayList 
		ArrayList<Integer> arrlist= new ArrayList<Integer>(); 

		// Appending the new elements 
		// at the end of the list 
		for (int i = 1; i <= 5; i++) 
			arrlist.add(i); 

		// Printing the ArrayList 
		System.out.println(arrlist); 

		// Removing an element from the 
		// List 
		arrlist.remove(3); 

		// Printing the ArrayList after 
		// removing the element 
		System.out.println(arrlist); 
	} 
} 
