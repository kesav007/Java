package chap09.module01;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Important Job is running in MyThread");
	}
}
