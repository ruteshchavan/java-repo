/*
Java inner class or nested class is a class that is declared inside the class or interface.
Non-static nested classes are known as inner classes.

*/


class AB{
	public void print() {
		System.out.println("Called class A");
	}
	class BA{
		public void print() {
			System.out.println("Called class B");
		}
	}
}
public class InnerClass {
	
	public static void main(String[] args) {
		AB obj=new AB();
		obj.print();
		AB.BA obj1=obj.new BA();
		obj1.print();

	}

}
