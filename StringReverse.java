
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String a=obj.next();
        StringBuilder str=new StringBuilder(a);

        for (int i=0;i<str.length()/2;i++) {
            int fnt=i;
            int bk=str.length()-1-i;

            char x=str.charAt(fnt);
            char y=str.charAt(bk);
            
            str.setCharAt(fnt, y);
            str.setCharAt(bk, x);
                
        }
            System.out.println(str);
        
    }
}
