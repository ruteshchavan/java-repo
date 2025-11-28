/* WAP to sort elements is ascending order.
TreeSet is a part of the java.util package and implements the Set interface.
TreeSet ensure that the elements are sorted in ascending order (by default).
It is a collection that does not allow duplicate elements and stores them in a sorted order.
 
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sorted {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<Integer>();		
		nums.add(33);
		nums.add(9);
		nums.add(21);
		nums.add(13);
		nums.add(55);
		System.out.println(nums);
		System.out.println();
		
		Iterator<Integer> b=nums.iterator();
		while(b.hasNext()) {
		System.out.println(b.next());
		}
	}
}


