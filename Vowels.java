// Write a program to count the number of vowels in a given string.
// Use length() to get the number of characters in the string.
// Use size() to get the number of elements in the list.

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a=obj.nextLine();
		a=a.toLowerCase();    // to handle both uppercase and lowercase vowels.	
		int count=0;
		
		
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){				
				count++;
			}
		}
		System.out.println("Total no. of vowels are : " +count);

	}

}
