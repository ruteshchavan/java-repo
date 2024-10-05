// String is sequence of character's or Character array.
// To declare string use keyword 'String'.

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


    }
}
