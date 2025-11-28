
interface computer{
	void code();
}

class laptop implements computer{
	public void code() {
		System.out.println("code compile run... on laptop");
	}
}

class desktop implements computer{
	public void code() {
		System.out.println("code compile run... on desktop");
	}
}

class code {
	public void call(computer lap) {
		lap.code();
	}
}

public class Program {
	public static void main(String[] args) {
		computer lap=new laptop();
		computer desk=new desktop();
		
		code a=new code();
		a.call(lap);
		
	}
}


