
// static method can be accessed without creating objects of the class.
// public/Instance method can be accessed only through objects.

public class Method {

  // Static method
  static void myStaticMethod(int x,int y) {
    System.out.println("Static methods can be called without creating objects");
    System.out.println(x*y);
  }

  // Instance method
  public static void myPublicMethod(int a,int b) {
    System.out.println("Instance methods must be called by creating objects");
    System.out.println(a+b);
  }

  public static void main(String[] args) {
    myStaticMethod(10,20); // Call the static method

    Method myObj = new Method(); // Create an object of Method
    myObj.myPublicMethod(10,20); // Call the public method
   
  }
}
