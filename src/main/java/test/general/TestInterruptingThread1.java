package test.general;

class TestInterruptingThread1 extends Thread {
	public void run() {
		// try {
			try {
				System.out.println("task");
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("exception handled");
				e.printStackTrace();
			}
			System.out.println("task1");
		
		/*} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted..." + e);
		}*/

	}

	public static void main(String args[]) {
		TestInterruptingThread1 t1 = new TestInterruptingThread1();
		TestInterruptingThread1 t2 = new TestInterruptingThread1();
		t1.start();
		
		    t1.interrupt();
			t2.start();
		

	}
}