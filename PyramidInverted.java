/*  

* * * * *
* * * *
* * *
* *
*

*/

import java.util.Scanner;

public class PyramidInverted {
    public static void main(String[] args) {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of star's pyramid :");
        int row=obj.nextInt();

        for(int i=row;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

