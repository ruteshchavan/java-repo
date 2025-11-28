// variable arguments is alternative form for method overloading.
// we can pass unlimited arguments instead creating multiple methods with diff. parameters
public class VarArg {

	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		System.out.println(sum(10,20));
		System.out.println(sum()); // also call with no arg.
		System.out.println(call("hello","everyone"));
		System.out.println(call("hello","everyone","welcome","to","world","of","java"));
	}
	
	public static int sum(int... a) {
		int sum=0;
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	public static String call(String... a) {
		String var="";
		for (String i : a) {
			var+=i+" ";
		}
		return var;
	}

}
