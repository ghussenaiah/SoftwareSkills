package test.java8.features;

public class MethodReference {
	
	public void m1() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

	public static void main(String args[]) {

		/*
		 * Runnable r = () -> {
		 * 
		 * for (int i = 0; i < 10; i++) { System.out.println("Child thread"); } };
		 */

		// Runnable r1 = MethodReference::m1;
		
		MethodReference t1 = new MethodReference();
		Runnable r1 = t1::m1;

		Thread t = new Thread(r1);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
