/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of row's :");
        int row=obj.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++) {
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
