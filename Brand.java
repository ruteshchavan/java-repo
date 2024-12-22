/* refer file Access.java */
public class Brand {

	public static void main(String[] args) {
		Access a=new Access();
		Access b=new Access();
		a.setBrand("Samsung");
		a.setPhone("S24");
		b.setBrand("Apple");
		b.setPhone("15 Pro");
		System.out.println(a.getBrand()+" "+a.getPhone());
		System.out.println(b.getBrand()+" "+b.getPhone());
		

	}

}
