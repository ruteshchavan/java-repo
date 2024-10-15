// To create a package, use the package keyword.
/* The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes)
   or a whole package that contain all the classes. 

The -d keyword specifies the destination for where to save the class file. Here (.) dot means within same directory.
   To compile package -
   javac -d . file_name.java            eg. javac -d . NewPackage.java

   To run -
   java package_name.file_name          eg. java simple.NewPackage.java
*/


public class NewPackage {
    public static void main(String[] args) {
        System.out.println("Created a Package!!!");
    }
}
