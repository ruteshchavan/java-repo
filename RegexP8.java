// WAP to Validate Alphanumeric Strings of Length 4 with Java Regex.

import java.util.regex.Pattern;

public class RegexP8 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Juli"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Ju22"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Peter"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "J$22"));
		 	
	}

}
