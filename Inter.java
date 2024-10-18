/*
Another way to achieve abstraction in Java, is with interfaces.


Syntax :
interface <interface_name>{  
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  

To access the interface methods, the interface must be "implemented" (inherited) 
by another class with the implements keyword (instead of extends).
*/

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

public  class Inter {
	public static void main(String[] args) {
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	  }

}
