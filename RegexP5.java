/*
The regular expression metacharacters work as shortcodes.

.		Any character (may or may not match terminator)
\d		Any digits, short of [0-9]
\D		Any non-digit, short for [^0-9]

\w		Any word character, short for [a-zA-Z_0-9]
\W		Any non-word character, short for [^\w]
\b		A word boundary
\B		A non word boundary

 */

import java.util.regex.Pattern;

public class RegexP5 {

	public static void main(String[] args) {
		
		
		 	System.out.println(Pattern.matches("\\d", "9"));
	        System.out.println(Pattern.matches("\\d", "dfg")); 
	        System.out.println(Pattern.matches("\\d", "8888"));
	        System.out.println(Pattern.matches("\\d*", "56565"));
	        
	        System.out.println();
	        
	        System.out.println(Pattern.matches("\\D", "m"));
	        System.out.println(Pattern.matches("\\D", "xds"));
	        System.out.println(Pattern.matches("\\D", "1"));
	        System.out.println(Pattern.matches("\\D*", "peter"));
	        
	        System.out.println();
	        
	        System.out.println(Pattern.matches(".", "m"));
	        System.out.println(Pattern.matches(".", "8"));
	        System.out.println(Pattern.matches(".", "99"));
	        System.out.println(Pattern.matches(".", "uiui"));
	
	}
}
