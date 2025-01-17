/*
  		    *  *  *  *  * 
         *  *  *  *  * 
      *  *  *  *  * 
   *  *  *  *  * 
*  *  *  *  * 

*/

import java.util.Scanner;

public class RhombusPattern {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no. of row's for a rhombus pattern");
		int n=obj.nextInt();
			
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=n;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
}
