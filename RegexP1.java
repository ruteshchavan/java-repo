// create a RE that accept alphanumeric character's only.
// sol- [a-zA-Z0-9]+

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexP1 {
	
	public static void str(String re,String str ) {
		Pattern pattern=Pattern.compile(re);
		Matcher matcher=pattern.matcher(str);
		boolean bool=matcher.matches();
		if(bool) {
			System.out.println("Valid regex");
		}else{
			System.out.println("Invalid regex");
		}
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Regular Expression : ");
		String re=obj.nextLine();
		System.out.println("Enter the string  : ");
		String str=obj.nextLine();
		str(re,str);
		
	}

}
