// The static keyword in Java is used for memory management mainly.
// Advantage of static variable is it makes your program memory efficient (i.e., it saves memory).
// static variable gets memory only once in the class

class Company {
    int emp_id;
    float salary;
    static String company="TCS";

    //constructor
    Company(int a, float b) {
       emp_id=a;
       salary=b;
    }

    void display(){
        System.out.println(emp_id +" "+ salary+" "+ company);
    }

}

public class StaticKey {
    public static void main(String[] args) {
        Company a1=new Company(101,45000);
        Company a2=new Company(102,48000);
        a1.display();
        a2.display();
    }
}
