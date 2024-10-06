/*
If you apply static keyword with any method, it is known as static method.
A static method can access static data member and can change the value of it.

*/

class Company {
    int emp_id;
    float salary;
    static String company="TCS";

    static void change(){
        company="BOSCH";
    }

    //constructor
    Company(int a, float b) {
       emp_id=a;
       salary=b;
    }

    void display(){
        System.out.println(emp_id +" "+ salary+" "+ company);
    }

}


public class StaticMethod {
    public static void main(String[] args) {
      Company a1=new Company(101,80000);
      Company a2=new Company(102,85000);
      Company.change();   // calling static method 
      a1.display();
      a2.display();

    }    
}
