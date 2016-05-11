package chap09.module03;

class NameRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Run by " + Thread.currentThread().getName() + " " + i);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ManyRames {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Seenu");
		two.setName("Kesav");
		three.setName("Kaumu");
		one.start();
		two.start();
		three.start();

	}
}
