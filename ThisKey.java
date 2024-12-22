/*
this is a reference variable that refers to the current object.

this keyword can be used to refer current class instance variable
and resolves the problem of ambiguity between the instance variables and parameter.

*/

class Cloth{
     String name;
     int size;

    Cloth(String name, int size){
        this.name=name;
        this.size=size;
    }
     void display(){
        System.out.println(name+" "+size);
    }
}

public class ThisKey {
    public static void main(String[] args) {
        Cloth a=new Cloth("Jeans",32);
        Cloth b=new Cloth("Shirt",39);
        a.display();
        b.display();
        
    }
}
