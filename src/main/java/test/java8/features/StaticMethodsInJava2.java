package test.java8.features;



interface newinterf {

	static void m1() {
		System.out.println("interface static  method ");
	}
}

public class StaticMethodsInJava2 {

	public static void main(String args[]) {
		newinterf.m1();
	}
}
