// constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// the constructor name must match the class name, and it cannot have a return type (like void).
/*
There are two types of constructors in Java:
1.Default constructor 
2.Parameterized constructor

We divide modifiers into two groups:
Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality
 */

public class Constructor {
  int x;

  // constructor created 
  public Constructor() {
    // x = 19;
    System.out.println("Output");
  }

  public static void main(String[] args) {
    Constructor myObj = new Constructor();
    // System.out.println(myObj.x);
  }
}

