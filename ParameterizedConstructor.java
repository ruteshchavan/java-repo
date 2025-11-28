// A constructor which has parameters is called parameterized constructor.
// It is used to provide different values to distinct objects.
// One cannot inherit a constructor.

public class ParameterizedConstructor {
        int age;
        String name;

    public ParameterizedConstructor(int x,String y) {
        age=x;
        name=y;
            }  

    void print(){
        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
        ParameterizedConstructor a1=new ParameterizedConstructor(19,"Jack");
        ParameterizedConstructor a2=new ParameterizedConstructor(21,"Sam");
        a1.print();
        a2.print();

    }
}