package test.logics;

class Employee {
	
}

public class CompilerConstructCheck {

	CompilerConstructCheck(int a) {
		System.out.println("value1 " + a);
	}

	CompilerConstructCheck(String b) {
		System.out.println("value2 " + b);
	}

	/*
	 * CompilerConstructCheck(Employee e) { System.out.println("value3 " + e); }
	 */

	public static void main(String args[]) {
		 CompilerConstructCheck b=new CompilerConstructCheck(null);
		 
	}
}


