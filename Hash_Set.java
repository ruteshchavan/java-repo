/*
A HashSet is a collection of items where every item is unique, and it is found in the java.util package.
HashSet contains unique elements only.
The initial default capacity of HashSet is 16, and the load factor is 0.75.

Set and List Difference : A list can contain duplicate elements whereas Set contains unique elements only.
*/

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		
		HashSet<Integer> num=new HashSet<Integer>();
		
		// Insert
		num.add(45);
		num.add(9);
		num.add(14);
		num.add(3); 
		num.add(77);
		
		System.out.println(num);
		
		
		// Search
		if(num.contains(14)) {
			System.out.println("Element found..");
		}else System.out.println("Element not found...");
		
		// delete
		num.remove(77);
		System.out.println(num);
		
		// size
		System.out.println("Total Elements : "+num.size());
		
	}
}
