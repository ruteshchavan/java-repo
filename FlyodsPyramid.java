/* print the pattern
    *
    * *
    * * *
    * * * * 
    * * * * * 
 */

import java.util.*;    // imports all the libraries 

public class FlyodsPyramid {
    public static void main(String[] args) {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of star's pyramid :");
        int row=obj.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
