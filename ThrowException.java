/*
The throw statement allows you to create a custom error.
Syntax : throw new exception_class("error message");  
*/
public class ThrowException {
	static void age(int x) {
		if(x<18){
			throw new ArithmeticException("NOT eligible for voting.");
		}
		else {
			System.out.println("eligible for voting.");
		}
	}
	public static void main(String[] args) {
		age(14);
	}

}
