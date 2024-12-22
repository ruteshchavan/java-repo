/* 
The final keyword in java is used to restrict the user from modifying it.
If you make any variable as final, you cannot change the value of final variable(constant).
If you make any method as final, you cannot override it.
If you make any class as final, you cannot extend it.
Output will be compile time error.
*/

public class FinalKey {
    final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  // error will be thrown as we are accessing the constant
 }  
    public static void main(String[] args) {
FinalKey obj=new  FinalKey();  
 obj.run();  
    }
}

/*  sample o/p

.\FinalKey.java:12: error: cannot assign a value to final variable speedlimit
  speedlimit=400;  // error will be thrown as we are accessing the constant
  ^
1 error
error: compilation failed

*/
