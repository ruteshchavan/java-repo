// creating atrributes and method in class and creating objects to access these attributes and method using dot syntax...
class Vehicle {
	int maxSpeed;
	int wheels;
	String Colour;
	void horn() {
	System.out.println("Beep-Beep");
	}	
}
public class Car {
	public static void main(String[] args) {
	Vehicle v1 = new Vehicle();
	Vehicle v2 = new Vehicle();
	Vehicle v3 = new Vehicle();
	Vehicle v4 = new Vehicle();
		v1.maxSpeed = 140;
		v2.wheels = 4;
		v3.Colour = "Black";
		System.out.println(v1.maxSpeed);
		System.out.println(v2.wheels);
		System.out.println(v3.Colour);
		v4.horn();

	}
}