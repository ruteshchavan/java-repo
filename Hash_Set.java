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
		
		num.add(45);
		num.add(9);
		num.add(14);
		num.add(3);
		num.add(14);   // duplicate element 
		num.add(77);
		
		System.out.println(num.size());
		
		Iterator<Integer> data=num.iterator();
		
		while(data.hasNext()) {
			System.out.println(data.next());
		}
		
	}

}
