package OOP;

class Book implements Runnable{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Update Db");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Num implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Multithreading {
	public static void main(String[] args) throws InterruptedException {
		
		
	Book B = new Book();
		
	Num N = new Num();
		
		
		Thread T1= new Thread();
		
		Runnable Book =new Book();
		
		Runnable Num =new Num();
		
		Book.run();
		
		Num.run();

		
		System.out.println("Bye....");
	}
}
