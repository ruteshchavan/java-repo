package simple;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		Circle c=new Circle();
		
		t.area1(10,20);
		c.area2(5);
		System.out.println(t.area());
		System.out.println(c.area());
	}
}
