package test.java8.features;

interface interfname {
	
	public void add(int a,int b);
}

public class MethodReferenceLevel2 {

	public static void sum(int x, int y) {

		System.out.println("sum of two number is " + (x + y));
	}

	public static void main(String args[]) {

		interfname f = (a, b) -> System.out.println("sum of two number is " + (a + b));
		
		// (a, b) -> System.out.println("sum of two number is " + (a + b)); nothig but providing implementation for the interfac add method 

		f.add(34, 54);

		interfname r1 = MethodReferenceLevel2::sum;
		
		// MethodReferenceLevel2::sum; nothing but providing alternative for the lamda expression (is called method reference )

		r1.add(10, 20);
	}

	// this is example for 

}
