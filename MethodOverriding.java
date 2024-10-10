/*
If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.

*/

class Product{
    double price(){
        return 0;
    }
}
class Amazon extends Product{
    double price(){
        return 55000;
    }
}
class Flipcart extends Product{
    double price(){
        return 56500;
    }
}
class Croma extends Product{
    double price(){
        return 57000;
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        Amazon a=new Amazon();
        Flipcart b=new Flipcart();
        Croma c=new Croma();
        System.out.println("Laptop price on Amazon : "+a.price());      
        System.out.println("Laptop price on Flipcart : "+b.price());
        System.out.println("Laptop price on Croma : "+c.price());
    }
}