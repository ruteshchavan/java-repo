/*
        *
      * *
    * * *
  * * * *
* * * * *

 */

import java.util.Scanner;

public class TriangleInverted180 {
    public static void main(String[] args) {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of star's pyramid :");
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
 