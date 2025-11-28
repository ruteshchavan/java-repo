// using scanner class and implementing all methods of scanner class...  
import java.util.Scanner ;
class ScanMethod
{
	public static void main(String[] args)
	{
     Scanner var = new Scanner(System.in);
     System.out.println("EnterName,Address,Age,Weight,CellNo,Gender,Married");

     String name = var.nextLine();
     
     String add = var.nextLine();

     int age = var.nextByte();
     
     double weight = var.nextDouble();

     long no = var.nextLong();
     
     String gender = var.next();
     
     boolean married = var.nextBoolean();


     System.out.println("\n");
     System.out.println("\n");
   

     System.out.println("Name : " + name );
     System.out.println("Address : " + add);
     System.out.println("Age : " + age);
     System.out.println("Weight : " + weight);
     System.out.println("Cell No. : " + no);
     System.out.println("Gender : " + gender);
     System.out.println("Marital Status (True/False) : " + married);



	}
}

