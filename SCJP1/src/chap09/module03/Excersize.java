package chap09.module03;

public class Excersize extends Thread {

	StringBuffer sb;

	public Excersize(StringBuffer sb) {
		this.sb = sb;
	}

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println(sb);
			}
		}
	}

	public void doStuff() {
		System.out.println("not synchronized");
		synchronized (this) {
			System.out.println("Synchronized");
		}
	}
	
	//TODO

}
