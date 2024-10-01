// The get method returns the variable value, and the set method sets the value.
/* Syntax for both is that they start with either get or set, followed by the name of the variable, 
   with the first letter in upper case.
   The this keyword is used to refer to the current object.
*/
public class Encapsulation {
    private String name; // private = restricted access
  
    public String getName() {
      return name;
    }
  
    public void setName(String newName) {
      this.name = newName;
    }
public static void main(String[] args) {
    Encapsulation obj=new Encapsulation();
      obj.setName("DYPCET");
      System.out.println(obj.getName());
    }
}

