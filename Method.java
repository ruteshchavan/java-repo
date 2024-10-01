// static and public modifiers.
// static method can be accessed without creating objects of the class.
// public method can be accessed only through objects.

public class Method {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    Method myObj = new Method(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
