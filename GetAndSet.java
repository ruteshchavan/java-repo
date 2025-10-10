//
public class GetAndSet {
	private String color;
	public String getColor() {
		return color;
	}
		public void setColor(String c) {
			this.color = c ;
		}
		public static void main(String[] args) {
			GetAndSet v1 = new GetAndSet() ;
			v1.setColor("Red");
			System.out.println(v1.getColor());
		}
}