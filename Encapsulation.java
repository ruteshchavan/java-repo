/* 
   Encapsulation in Java is a process of wrapping code and data together into a single unit.
   By providing only a setter or getter method, you can make the class read-only or write-only.
   It is a way to achieve data hiding in Java.
   
   Syntax for both is that they start with either get or set, followed by the name of the variable, 
   with the first letter in upper case.
   
   The this keyword is used to refer to the current object.
   The get method returns the variable value, and the set method sets the value.
*/

public class Encapsulation {
    private String name; // private = restricted access
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
public static void main(String[] args) {
    Encapsulation obj=new Encapsulation();
      obj.setName("DYPCET");
      System.out.println(obj.getName());
    }
}

