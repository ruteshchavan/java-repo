/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
import java.util.*;
public class PyramidNumber{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number of row's to print pyramid stars :");
        int n = obj.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
        
            }
            System.out.println();
        }
    }
}
