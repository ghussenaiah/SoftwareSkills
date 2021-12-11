package test.logics;



class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

class InterThreadCommunication extends Thread {
	/*
	 * final Customer c = new Customer(); public void run() { c.deposit(10000); }
	 */
	public static void main(String args[]) {
	/*	InterThreadCommunication t1=new InterThreadCommunication();
		t1.start();
		InterThreadCommunication t2=new InterThreadCommunication();
		t2.start();*/
		final Customer c = new Customer();
		new Thread(() -> {
			c.withdraw(15000);
		}).start();
		
		new Thread(() -> {
			c.deposit(10000);
		}).start();
		
		
		
		
	/*	final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();*/
    
}}