package test.java8.features;




interface interf {

	static void m1() {
		System.out.println("interface static  method ");
	}
}

public class StaticMethodsInJava implements interf {

	public static void main(String args[]) {
		interf.m1();
	}
}