/*
Method overloading means multiple methods can have the same name but different no. parameters.
*/

public class MethodOverload {

    static void add(int x,int y){
        System.out.println(x+y);
    }

    static void add(double x,double  y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        add(10,20);
        add(11.3,55.7);
    }
}
