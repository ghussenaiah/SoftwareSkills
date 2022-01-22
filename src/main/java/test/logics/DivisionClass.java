package test.logics;



public class DivisionClass {

	public static void main(String[] args) {
	
		int a = 10;

		for (int i = 0; i <= 10; i++)
			try {
				System.out.println("new i"+i);
				System.out.println(a % i);
			}

			catch (ArithmeticException e) {
				System.out.println(e);

			}
	}
}


/*
 * for (int i = 3; i >= 0; i--) try { System.out.println(a / 0); }
 * 
 * catch (ArithmeticException e) { System.out.println(e);
 * 
 * }
 */