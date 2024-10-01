import java.util.*;

public class Str {
    public static void main(String[] args) {
        String fname= "beetle";
        String lname= "juice";
        String content="Welcome to the Java";

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

    }
}
