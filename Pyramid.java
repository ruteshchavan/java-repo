/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * *
 
 */

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int n=obj.nextInt();
		for(int i=1; i<=n; i++) {
	          
	           for(int j=1; j<=n-i; j++) {
	               System.out.print("  ");
	           }
	           
	           for(int j=i; j>=1; j--) {
	               System.out.print("*"+" ");
	               
	           }
	           
	           for(int j=1;j<i;j++){
	        	   System.out.print("*"+" ");
	           }
	           System.out.println();
	       }

	}

}
