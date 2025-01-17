/*

 *                    * 
 *  *              *  * 
 *  *  *        *  *  * 
 *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  * 
 *  *  *        *  *  * 
 *  *              *  * 
 *                    *  
  
 */


import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no. rows to print Butterfly pattern : ");
		int n=obj.nextInt();
		
		//upper part
		for(int i=1; i<=n; i++) {
	           for(int j=1; j<=i; j++) {
	               System.out.print(" * ");
	           }


	           for(int j=1; j<=2 * (n-i); j++) {
	               System.out.print("   ");
	           }


	           for(int j=1; j<=i; j++) {
	               System.out.print(" * ");
	           }
	           System.out.println();
	       }


	       //lower part
	       for(int i=n; i>=1; i--) {
	           for(int j=1; j<=i; j++) {
	               System.out.print(" * ");
	           }
	           
	           for(int j=1; j<=2*(n-i); j++) {
	               System.out.print("   ");
	           }

	           for(int j=1; j<=i; j++) {
	               System.out.print(" * ");
	           }
	           System.out.println();
	       }

	}
}
