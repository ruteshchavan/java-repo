/*
HashMap however, store items in "key/value" pairs.
One object is used as a key (index) to another object (value). 

*/

import java.util.HashMap;
import java.util.Map;

public class HashMapp {

	public static void main(String[] args) {
		
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		
		// put method used to add items.
		data.put("tim",75);   
		data.put("david",88);
		data.put("stark",73);
		data.put("calvin",85);
		data.put("bob",96);
		System.out.println(data);
		
		// get() method used to access the item.
		System.out.println(data.get("stark"));
		
		// remove() method used to remove the element.
		System.out.println(data.remove("bob"));     
		System.out.println(data);
		
		// To find out how many items there are, use the size() method.
		System.out.println(data.size());
		
		// Use the keySet() method if you only want the keys.
		System.out.println(data.keySet());
		
		// use the values() method if you only want the values.
		System.out.println(data.values());   
		
		// iteration
		for( Map.Entry<String, Integer> a : data.entrySet()){
			System.out.print(a.getKey() + " ");
			System.out.println(a.getValue());
		}
		
	}
}
