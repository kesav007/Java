package chap09.module03;


public class AccountDanger implements Runnable {
	Account acct = new Account();

	public static void main(String[] args) {
		AccountDanger r = new AccountDanger();
		AccountDanger r2 = new AccountDanger();
		
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

	private synchronized void makeWithdrawal(int amt) {
		int balance = acct.getBalance();
		if (balance >= amt) {
			System.out.println(Thread.currentThread().getName()
					+ " is going to withdraw");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()
					+ " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for "
					+ Thread.currentThread().getName() + " to withdraw "
					+ balance);
		}
	}

}
