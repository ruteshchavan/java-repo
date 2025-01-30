/*
Java StringBuilder class is used to create mutable (modifiable) String.
Difference between strbuilder and strbuffer is strbuffer is thread safe and strbuilder is not thread safe.
*/

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("Null");
        System.out.println(a);

        //charAt()
        System.out.println(a.charAt(0));

        //setCharAt()
        a.setCharAt(0,'P');
        System.out.println(a);

        //insert() method inserts the given string at the given position.
        a.insert(4,"y");
        System.out.println(a);

        //delete() method deletes the string from the specified beginIndex to endIndex.
        a.delete(4,5);
        System.out.println(a);

        //append() method concatenates the given argument with this String.
        a.append("e");
        a.append("r");
        System.out.println(a);
        
        //reverse() method of StringBuilder class reverses the current string.
    }
}
