// Constructor in Java is a special method that is used to initialize objects.
// Constructor is a special method which is called automatically when an object is created.
// The constructor is called when an object of a class is created.
// the constructor name must match the class name, and it cannot have a return type (like void).
/*
There are two types of constructors in Java:
1.Default constructor 
2.Parameterized constructor

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.

We divide modifiers into two groups:
Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality
*/

public class Constructor {
  int x;

  // constructor created 
  public Constructor() {
     x = 19;
    System.out.println("Output");
  }

  public static void main(String[] args) {
    Constructor myObj = new Constructor();
     System.out.println(myObj.x);
  }
}

