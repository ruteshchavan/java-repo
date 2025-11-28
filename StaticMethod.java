
/*
If you apply static keyword with any method, it is known as static method.
A static method can access static data member and can change the value of it.
The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.

Why is the Java main method static -
It is because the object is not required to call a static method. 
If it were a non-static method, JVM creates an object first then call main() method.

*/

class Comp {
    int emp_id;
    float salary;
    static String company="TCS";

    static void change(){
        company="BOSCH";
    }

    static void call(){
        System.out.println("Welcome Everyone");
    }

    //constructor   
    Comp(int a, float b) {
       emp_id=a;
       salary=b;
    }

    void display(){
        System.out.println(emp_id +" "+ salary+" "+ company);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
      Comp a1=new Comp(101,80000);
      Comp a2=new Comp(102,85000);
      Comp.change();   // calling static method // this static method updates the
      Comp.call();
      a1.display();
      a2.display();
    }    
}
