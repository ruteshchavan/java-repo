/*
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
Enum is short for "enumerations", which means "specifically listed".
Use enums when you have values that you know aren't going to change.

 
*/

enum Status{
	Running , Failed , Pending , Success;
}

public class Enum {

	public static void main(String[] args) {
		
		Status a = Status.Pending;
		System.out.println(a);
		
		Status[] b=Status.values();  // values() method, which returns an array of all enum constants.
		 
		
		for(Status y:b){
			System.out.println(y +" : "+ y.ordinal());  //ordinal() is used to print index no.
		}
	}

}
