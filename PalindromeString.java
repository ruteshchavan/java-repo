import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String a=obj.next();   // user input
        String b=a;   // string for comparison.
        String rev="";   // storing reverse string

        for (int i=a.length()-1 ; i>=0 ; i--) {
            rev=rev + a.charAt(i);
        }
            
        if(rev.equals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
