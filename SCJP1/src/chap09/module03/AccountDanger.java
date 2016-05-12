package chap09.module03;


public class AccountDanger implements Runnable {
	Account acct = new Account();

	public static void main(String[] args) {

		System.out.println("==============================================");
		System.out.println("Lucy and Fred has common account with $50 balance");
		System.out.println("Each tries to withdraw $10 five times. See how it works");
		System.out.println("==============================================");

		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn");
			}
		}
	}

	private void makeWithdrawal(int amt) {
		int balance = acct.getBalance();
		if (balance >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println(
					"Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + balance);
		}
	}

}
