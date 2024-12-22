/*
Threads allows a program to operate more efficiently by doing multiple things at the same time.
There are two ways to create a thread:
1.By extending Thread class and overriding its run() method.	
2.By implementing Runnable interface.

*/

class A extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getId() +" Value : "+i);
		}
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Threads {
	public static void main(String[] args) {
		A x=new A();
		x.start();
		A y=new A();
		y.start();
	}

}
