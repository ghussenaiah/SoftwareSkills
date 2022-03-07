package test.logics;



import java.util.Random;

public class StringNumerConcat {
   public static void main( String args[] ) {
      int val = 3;
      String str = "" + val;
      System.out.println(str + " = Rank ");
      
      int z=10;
		for (int i = 3; i > 0; i--)
			try {
				if(i==2) {
					System.out.println(z/ 0);
				}else {
					System.out.println(z/ i);
				}
			
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		
		
            int a = 3;
            int b = 4;


		System.out.println(" " + 7 + 2 + " "); // 72
		System.out.println(7 + 2 + " "); // 9
		System.out.println(7 + 2 + " a "); // 9 a
		System.out.println(a + b); // 7
		System.out.println(" " + a + b + " "); // 34
		System.out.println(foo() + a + b + " "); // foo34
		System.out.println(a + b + foo()); // 7foo
		System.out.println(" " + 7 + 2 + 5 + 4 + " "); // 7254
		System.out.println(" " + 7 + 2 + 5 + 4.9); // 7254.9
      
    }

	static String foo() {
		return "foo";
	}
}

// String + int + int + String => String 