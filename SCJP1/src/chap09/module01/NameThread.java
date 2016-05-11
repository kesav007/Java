package chap09.module01;

class NameRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("NameRunnable Running");
		System.out.println("Run by " + Thread.currentThread().getName());

	}
}

public class NameThread {

	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread t = new Thread(nr);
		t.setName("Fred");
		t.start();
		Thread t2 = new Thread(nr);
		t2.start();
	}

}
