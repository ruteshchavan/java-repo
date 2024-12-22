/* 
The super keyword in Java is a reference variable which is used to refer immediate parent class object.

super keyword can be used to refer immediate parent class instance variable,parent class method and parent class constructor.

We can use super keyword to access the data member/field of parent class.It is used if parent class and child class have same fields.



*/

class Animal{    // parent class 
    String color="white";
    void bark(){
        System.out.println("Barking...");
    } 
}

class Dog extends Animal{   // child class
    String color="black"; 
    void bark(){
        System.out.println("Dog barking....");
    } 
    void printColor(){  
    System.out.println(color); //prints color of Dog class  
    System.out.println(super.color); //prints color of Animal class
    super.bark(); // prints the method of parent class
    bark();  // prints method of child class
    }  
}  

public class SuperKey {
    public static void main(String[] args) {
       Dog a=new Dog();
       a.printColor(); 
    }
}
