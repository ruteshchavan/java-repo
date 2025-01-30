/*
HashMap however, store items in "key/value" pairs.
One object is used as a key (index) to another object (value). 

*/

import java.util.HashMap;

public class HashMapp {

	public static void main(String[] args) {
		
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		data.put("tim",75);   // put method used to add items.
		data.put("david",88);
		data.put("stark",73);
		data.put("calvin",85);
		data.put("bob",96);
		System.out.println(data);
		System.out.println(data.get("stark"));      // get() method used to access the item.
		System.out.println(data.remove("bob"));     // remove() method used to remove the element.
		System.out.println(data);
		System.out.println(data.size());       // To find out how many items there are, use the size() method.
		System.out.println(data.keySet());    // Use the keySet() method if you only want the keys.
		System.out.println(data.values());    // use the values() method if you only want the values.
		
	}
}
