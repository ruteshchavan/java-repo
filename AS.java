import java.util.Scanner;

public class AS {

	public static void main(String[] args) {
		

		        // Reading input
		        Scanner s = new Scanner(System.in);
		        int N = s.nextInt();  // number of elements in the array

		        int[] data = new int[N];
		        for (int i = 0; i < N; i++) {
		            data[i] = s.nextInt();  // reading each element
		        }

		        // Get the last digit of the last number in the array
		        int lastDigit = data[N - 1] % 10;  // Get the last digit of the last number

		      System.out.println(lastDigit);


	}

}
