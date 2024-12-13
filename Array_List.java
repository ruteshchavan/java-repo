/*
ArrayList class uses a dynamic array for storing the elements. 
Syntax :
ArrayList<Wraper_class> object_name = new ArrayList<Integer>(size);
eg.: ArrayList<Integer> a = new ArrayList<Integer>(5); 
*/

import java.util.ArrayList;   //import ArrayList class which is found java.util package.

public class Array_List {
	public static void main(String[] args) {
		
		 ArrayList<String> cars = new ArrayList<String>();   
		 
		 // add() method is used to add elements
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);  // prints elements on the same line inside [] bracket.
		    System.out.println();
		    
		    for(String n : cars ) {
		    	System.out.println(n);
		    }
		    System.out.println();
		   
		    
		 // get() method used to access element in array
		    System.out.println(cars.get(2));
		 
		 // To modify an element, use the set() method 
		    cars.set(3, "KIA");
		    System.out.println(cars);
		    
		 // To remove an element, use the remove() method
		    cars.remove(2);
		    System.out.println(cars);
		 
		 // To find out how many elements an ArrayList have, use the size() method
		    System.out.println(cars.size());
		    
		 // add() method adds all of the items from a collection to the list.
		    ArrayList<String> brands = new ArrayList<String>();
		    brands.add("Microsoft");
		    brands.add("Apple");
		    
		    brands.addAll(cars);      // addAll(index , array_list) index is optional
		    System.out.println(brands);
		    
		  // The clear() method removes all items from the list.
		    brands.clear();
		    System.out.println(brands);
		    
	}
}
