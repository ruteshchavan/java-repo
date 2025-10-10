import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand=new Random();
        // will generate random number from 0 to n.
               
        for(int i=0;i<1;i++) {
        	int x=rand.nextInt(1,13);
        	System.out.println(x); 
        }
    }
}