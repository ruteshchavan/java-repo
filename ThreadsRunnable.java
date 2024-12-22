
class Demo implements Runnable{

	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getId() +" Value : "+i);
		}
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

public class ThreadsRunnable {

	public static void main(String[] args) {
		Thread a1=new Thread(new Demo());
		Thread a2=new Thread(new Demo());
		a1.start();
		a2.start();

		 
	}

}
