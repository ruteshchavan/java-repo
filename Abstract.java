/*
Abstraction is the process of hiding certain details and showing only essential information to the user.
There are two ways to achieve abstraction in java :
1.Abstract class 
2.Interface

Abstract class: It is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: It can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
We cannot create object of a abstract class.We need to create object of inherited abstract class.
*/


abstract class Shape{  
abstract void draw();  
}  

class Rect extends Shape{  
void draw(){
	System.out.println("drawing rectangle");}  
} 

class Circle1 extends Shape{  
void draw(){
	System.out.println("drawing circle");}  
}  
  
class Abstract{  
public static void main(String args[]){  
	Shape r=new Rect();
	r.draw(); 
	Shape s=new Circle1();
	s.draw();  
  }  
}  
