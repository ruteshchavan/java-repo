/*
A try block can be followed by one or more catch blocks.Each catch block must contain a different exception handler.

*/
public class TryCatchMultiple {

	public static void main(String[] args) {
		try{    
            int a[]=new int[5];    
            
            System.out.println(a[10]);  
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             

		   finally {
		      System.out.println("The 'try catch' is finished.");
	          }
	}
}
