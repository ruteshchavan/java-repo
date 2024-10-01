/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/

import java.util.Scanner;

public class FlyodsTriangle {
    public static void main(String[] args) {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of row's :");
        int row=obj.nextInt();
        int sum=1;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
