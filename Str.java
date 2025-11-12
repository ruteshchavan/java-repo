// String is sequence of character's or Character array.
// To declare string use keyword 'String'.
// In string we use equals() method to compare string not == because in heap string pool is maintained 
// 		where same data is been reused.So if comparing same data will always return true as object reference is been compared rather than data.

public class Str {
    public static void main(String[] args) {
        String fname= "beetle";
        String lname= "juice";
        String content="Welcome to the Java";
        String val="  Microsoft  ";

        // concatenation - combines two string
        String name=fname + lname;
        System.out.println(name);

        // length - prints length of a string
        System.out.println(name.length()); 

        // charAt - prints every character of a string 
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        //compareTo - compares strings
        // 3 cases : s1 > s2 = + value  |  s1 == s2 = 0  |  s1 < s2 = - value
        if(fname.compareTo(lname) == 0) {
            System.out.println("String are equal..");
        }
        else {
            System.out.println("Strings are NOT equal..");
        }

        // substring
        // substring(begin index , end index)
        System.out.println(content.substring(5,content.length()));

        // print string to lowercase
        System.out.println(fname.toLowerCase());

        // print to uppercase
        System.out.println(lname.toUpperCase());

        // replace the in string
        System.out.println(content.replaceAll("Java","VS Code"));

        //replace a old character with new character in string.
        System.out.println(fname.replace('e', 'a'));

        // to check index of character.
        System.out.println(fname.indexOf('l'));
        
        // trim() method eliminates leading and trailing spaces.
        System.out.println(val.length()); // Before length
        String a=val.trim(); 
        System.out.println(a.length()); // After length
        
      // split() method splits the string based on whitespace .
        String s1="java string split method by javatpoint";  
        String[] words=s1.split("\\s");    
        for(String w:words){  
        System.out.println(w);  
        }  
        
        
        
        
        
        
        
        
        


    }
}
