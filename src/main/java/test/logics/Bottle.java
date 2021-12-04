package test.logics;

class Employee {
	
}

public class Bottle {

	Bottle(int a) {
		System.out.println("value1 " + a);
	}

	Bottle(String b) {
		System.out.println("value2 " + b);
	}

	/*
	 * Bottle(Employee e) { System.out.println("value3 " + e); }
	 */

	public static void main(String args[]) {
		 Bottle b=new Bottle(null);
	}
}
