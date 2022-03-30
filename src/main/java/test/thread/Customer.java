package test.thread;


public class Customer {

	
	int amount=0;
	
	
	synchronized void addamount(int amount) {
		
		this.amount=this.amount+amount;
		System.out.println("added amount   "+this.amount);
		
		 notify();
	}
	
	synchronized void Withdram(int amount) throws InterruptedException {

		if(this.amount < amount) {
			System.out.println("old balance  "+this.amount);
			 wait();
		}
		this.amount=this.amount-amount;
		System.out.println("withdraw done");
		System.out.println("new balance   "+this.amount);
		
	}
	
	public static void main(String args[]) {
		
		Customer c=new Customer();
		
		new Thread() {
			public void run() {
				try {
					c.Withdram(50);
					c.addamount(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		
		  new Thread() { public void run() { c.addamount(1000); } }.start();
		 
	}
}
