package chap09.module02;

class NameRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("NameRunnable Running");
		System.out.println("Run by " + Thread.currentThread().getName());
	}
}

public class ManyNames {

	public static void main(String[] args) throws InterruptedException {
		NameRunnable nr = new NameRunnable();
		Thread t1 = new Thread(nr);
		Thread t2 = new Thread(nr);
		Thread t3 = new Thread(nr);
		t1.setName("Fred");
		t2.setName("Lucy");
		t3.setName("Ricky");
		t1.start();
		t2.start();
		t3.start();
	}
}
