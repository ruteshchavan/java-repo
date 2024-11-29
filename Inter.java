/*
Another way to achieve abstraction in Java, is with interfaces.

Syntax :
interface interface_name{  
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  

To access the interface methods, the interface must be "implemented" (inherited) 
by another class with the (implements) keyword (instead of extends).

3 types of interface ;
normal interface - interface that has more than 1 methods.
functional interface - interface that has only 1 method. Also known as single abstract method.
marker interface  - the interface that has no method or a blank interface. 


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
	    DemoClass myObj ;
	    myObj= new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	  }
}
