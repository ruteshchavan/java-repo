/*
[a-zA-Z] - a through z or A through Z, inclusive (range).
[a-d[m-p]] - a through d, or m through p. any character between a-d or m-p.
[a-z&&[def]] - d, e, or f (intersection).
[a-z&&[^bc]] - a through z, except for b and c.
[a-z&&[^m-p]] - a through z, and not m through p.

 */

import java.util.regex.Pattern;

public class RegexP4 {

	public static void main(String[] args) {
		
		System.out.println("[a-zA-Z] matches d = " +   Pattern.matches("[a-zA-Z]", "d"));
        System.out.println("[a-zA-Z] matches ddZY = " +   Pattern.matches("[a-zA-Z]", "ddZY"));
        System.out.println("[a-d[m-p]] matches n = " +   Pattern.matches("[a-d[m-p]]", "n"));
        System.out.println("[a-d[m-p]] matches e = " +   Pattern.matches("[a-d[m-p]]", "e"));
        System.out.println("[a-d[m-p]] matches A = " +   Pattern.matches("[a-d[m-p]]", "A"));
        System.out.println("[a-z&&[def]] matches e = " +   Pattern.matches("[a-z&&[def]]", "e"));
        System.out.println("[a-z&&[def]] matches f = " +   Pattern.matches("[a-z&&[def]]", "f"));
        System.out.println("[a-z&&[def]] matches def = " +   Pattern.matches("[a-z&&[def]]", "def"));
        System.out.println("[a-z&&[^bc]] matches h = " +   Pattern.matches("[a-z&&[^bc]]", "h"));
        System.out.println("[a-z&&[^bc]] matches c = " +   Pattern.matches("[a-z&&[^bc]]", "c"));
        System.out.println("[a-z&&[^m-p]] matches b = " +   Pattern.matches("[a-z&&[^m-p]]", "b"));
        System.out.println("[a-z&&[^m-p]] matches o = " +   Pattern.matches("[a-z&&[^m-p]]", "o"));	
        
	} 
}
