/* object is an entity that has state , behavior and identity. Here, state means data and behavior means functionality and
   identity is unique ID that is used by JVM to identify each object uniquely.
*/ 
// Collection of objects is called class. It is a logical entity.
// class is a user-defined data type. Inside a class, we define variables, constants, methods , constructor's etc.
// All the members of the class can be accessed through object.
// Instance variable - A variable which is created inside the class but outside the method is known as an instance variable.
/* There are 3 ways to initialize object in Java -
    1.By reference variable
    2.By method
    3.By constructor
JVM creates two area of Memory when it starts stack and heap.
Variables are stored in stack.The heap stores objects.
*/

class Car {
    String brand;
    String color;
}

public class ObjectClass1 {
    public static void main(String args[]) {
        Car a1=new Car();   // object created
        a1.brand="BMW";
        a1.color="Black";
        System.out.println("Car company : "+a1.brand+" color : "+a1.color);

    }
}
