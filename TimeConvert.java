// using java scanner taking input from user and displaying days into seconds...

import java.util.Scanner;
class TimeConvert
{
	public static void main(String[] args)
	{
	 Scanner scan= new Scanner(System.in);
	 int days = scan.nextInt();
	 int hours = days*24;
	 int minutes = hours*60;
	 int seconds = minutes*60;
	 System.out.println("Entered Days are : "+ days);
	 System.out.println("Days converted into seconds : "+ seconds);
	}
}
