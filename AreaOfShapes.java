/* Using function dne method calculating Area of shapes */

class Area  // sub class
   { 
  double a , b , c , pi ;
  void ShapeValue(double length ,double heigth,double breadth)
  {
   a=length;
   b=heigth;
   c=breadth;
   pi=3.14;
  }
     
     double AreaOfCircle()
     {
     	return(pi*(a*a));
     }

     double AreaOfRectangle()
     {
     	return(a*c);
     }

     double AreaOfTriangle()
     {
     	return(0.5*a*c);
     } 

   };
 class AreaOfShapes
 {
 	public static void main(String args[])
 	{
      Area A= new Area();
      A.ShapeValue(3,6,9);
      
   System.out.println("Area of Circle is : " + A.AreaOfCircle() );
 	  
   System.out.println("Area of Rectangle is : " + A.AreaOfRectangle() );

   System.out.println("Area of Circle is : " + A.AreaOfTriangle() );
 	}
 }    
