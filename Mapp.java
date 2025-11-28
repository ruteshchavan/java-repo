// The Map interface is a part of the Java Collections Framework and is used to store key-value pairs. 
// Each key must be unique, but values can be duplicated.
// A TreeMap is a collection that stores key/value pairs in sorted order by key.
/*
 Common classes that implement Map:
	HashMap - fast and unordered
	TreeMap - sorted by key
	LinkedHashMap - ordered by insertion and duplicates are ignored

Common Map Methods:
put(): Adds or updates a key-value pair
get(): Returns the value for a given key
remove(): Removes the key and its value
containsKey(): Checks if the map contains the key
keySet(): Returns a set of all keys

*/


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapp {

    public static void main(String[] args) {
        Map<String, Integer> ab = new HashMap<>();
       
        ab.put("a", 10);
        ab.put("b", 20);
        ab.put("c", 30);
        System.out.println(ab);
        System.out.println(ab.get("b"));

        Map<String, Integer> dd = new TreeMap<>();
        dd.put("f", 10);
        dd.put("d", 20);
        dd.put("c", 30);
        System.out.println(dd);


       
    }
}
