/*

The Exception Handling is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
The core advantage of exception handling is to maintain the normal flow of the application.
There are three types of exceptions namely:
1.Checked Exception - Checked exceptions are checked at compile-time. Eg.IOException
2.Unchecked Exception - Unchecked Exception are checked at runtime. Eg.ArrayIndexOutOfBoundsException
3.Error - Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError.

The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
The finally statement lets you execute code, after try...catch statement, regardless of the result.	

List of common Error and Exception :
1. ArrayIndexOutOfBoundsException - Occurs when trying to access an index number that does not exist in an array.
2. ArithmeticError - Occurs when a numeric calculation goes wrong.
3. StringIndexOutOfBoundsException - Occurs when trying to access a character in a String that does not exist.
4. ClassNotFoundException - Occurs when trying to access a class that does not exist.
5. FileNotFoundException - Occurs when a file cannot be accessed.
6. InputMismatchException - Occurs when entering wrong input (e.g. text in a numerical input).
7. NegativeArraySizeException - Occurs when trying to create an array with negative size.
8. NullPointerException - Occurs when trying to access an object reference that is null.
9. NoSuchFieldException	- Occurs when trying to access a class field/variable that does not exist.
10.NoSuchMethodException - Occurs when trying to access a class method that does not exist.

*/
public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } 
		
		catch (Exception e) {
		      System.out.println(e);
		 }
		
		finally {
		      System.out.println("The 'try catch' is finished.");
		    }
	
	}
}

