package chap09.module03;

public class Account {

	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amt) {
		balance = balance - amt;
	}

}
