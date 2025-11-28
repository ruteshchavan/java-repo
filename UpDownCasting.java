/*
Type casting is when you assign a value of one primitive data type to another type.
Upcasting and Downcasting is the type of object typecasting.
Parent and Child objects are two types of objects. So, there are two types of typecasting possible for an object, i.e., 
Parent to Child (Downcasting) and Child to Parent (Upcasting).
*/

class ABC {
		public void print1() {
			System.out.println("Class A called..");
		}
	}
class XYZ extends ABC {
		public void print2() {
			System.out.println("Class B called..");
		}
	}
	
public class UpDownCasting {
	
	public static void main(String[] args) {
		
// Upcasting: Creating a XYZ object, but referencing it as ABC.
		ABC obj1= new XYZ();
		obj1.print1();
		
// Downcasting: If you want to call XYZ print2() method, you need to downcast.
		XYZ obj2=(XYZ) obj1;
		obj2.print2();
		obj2.print1();
		
	}

}
