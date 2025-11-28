/*
 Java Math class is a fundamental part of the Java language's standard library, offering a wide range of mathematical functions.
 
 Additionally, it offers methods for more complex operations such as finding the maximum or minimum of two numbers, 
 raising a number to a power, and calculating logarithms and trigonometric functions.

Important Function's :
1. Math.abs() - It will return the Absolute value of the given value.
2. Math.max() - It returns the Largest of two values.
3. Math.min() - It is used to return the Smallest of two values.
3. Math.round() - It is used to round of the decimal numbers to the nearest value.
4. Math.sqrt() - It is used to return the square root of a number.
5. Math.cbrt() -It is used to return the cube root of a number.
6. Math.pow() - It returns the value of first argument raised to the power to second argument.
7. Math.hypot() - It returns sqrt(x2 +y2) without intermediate overflow or underflow.
8. Math.toDegrees - It is used to convert the specified Radians angle to equivalent angle measured in Degrees.
9. Math.toRadians - It is used to convert the specified Degrees angle to equivalent angle measured in Radians.
10.Math.signum() - It is used to find the sign of a given value.

 */

import java.lang.Math;

public class MathClass {
	
    // driver code
    public static void main(String args[])
    {
        double a = 4;
        double b = 2;
        double c = 5.6;
        double d = -5.6;
        
        System.out.println("Absolute value is : "+Math.abs(d));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.round(c));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.cbrt(b));
        System.out.println(Math.pow(a,b));
        System.out.println(Math.hypot(a,b));        
        System.out.println(Math.toDegrees(a));  
        System.out.println(Math.toRadians(b));  
    }
}
