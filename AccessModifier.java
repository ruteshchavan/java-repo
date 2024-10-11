/* 
There are two types of modifiers in Java: access modifiers and non-access modifiers.
The access modifiers specifies the accessibility or scope of a field, method, constructor, or class.
Non-Access Modifiers do not control access level, but provides other functionality.
By providing only a setter or getter method, you can make the class read-only or write-only


There are four types of Java access modifiers:
Private: The access level of a private modifier is only within the class. 
         It cannot be accessed from outside the class.

Default: The access level of a default modifier is only within the package. 
         It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

Protected: The access level of a protected modifier is within the package and outside the package through child class. 
          If you do not make the child class, it cannot be accessed from outside the package.

Public: The access level of a public modifier is everywhere. 
        It can be accessed from within the class, outside the class, within the package and outside the package.
*/
package sample;

public class AccessModifier {
    public static void main(String[] args) {
        AccessPackage a=new AccessPackage();
        AccessPackage b=new AccessPackage();
        a.setBrand("Samsung");
        a.setPhone("S24");
        System.out.println(a.getBrand());
        System.out.println(a.getPhone());
        b.setBrand("Apple");
        b.setPhone("15 Pro");
        System.out.println(b.getBrand());
        System.out.println(b.getPhone());
    }
}
