import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random rand=new Random();
        int x=rand.nextInt(1000); // will generate random number from 0 to 1000.
        System.out.println(x);        
    }
}