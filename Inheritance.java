/*
Inheritance means to inherit attributes and methods from one class to another.
subclass (child) - the class that inherits from another class.
superclass (parent) - the class being inherited from.
To inherit from a class, use the extends keyword.
If we don't want other classes to inherit from a class, use the final keyword.
 */

class emp{
    float salary=45000;
}

class Inheritance extends emp {
    float bonus=10000;
    public static void main(String[] args) {
        Inheritance a=new Inheritance();
        System.out.println("Salary : "+a.salary);
        System.out.println("Bonus : "+a.bonus);
    }
}
