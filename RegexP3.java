// create a RE that matches a email.
// ^[a-zA-Z0-9_.#$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexP3 {

	public static void str(String re,String str ) {
		Pattern pattern=Pattern.compile(re);
		Matcher matcher=pattern.matcher(str);
		boolean bool=matcher.matches();
		System.out.println(bool);
		
		
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
