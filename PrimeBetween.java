// WAP to print prime number between range.

import java.util.Scanner;

public class PrimeBetween {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the range for Prime Number : ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int j;
 

        for(int i=a;i<=b;i++) {
            for(j=2;j<=a;j++){
                if(a%j==0) {
                    break;
                }
                
            }
            if(j==a){
                System.out.print(i+" ");
            }
            
        }

    }
}    
    


    