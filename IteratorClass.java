/*
Iterator is an object that can be used to loop through collections, like ArrayList.

*/

import java.util.Iterator;   //import Iterator class.
import java.util.ArrayList;

public class IteratorClass {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Nike");
		a.add("Puma");
		a.add("Adidas");
		a.add("UnderArmour");
		
		Iterator<String> b=a.iterator();
		
		while(b.hasNext()) {
		System.out.println(b.next());
		}

	}
}
