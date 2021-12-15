package test.java8.features;




interface Left {

	default void m1() {
		System.out.println("interface left default method ");
	}
}

interface Right {

	default void m1() {
		System.out.println("interface right default method ");
	}
}

public class MultipleInheritaceWithInterface implements Left, Right {

	public void m1() {
		System.out.println("own default method ");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String args[]) {

		MultipleInheritaceWithInterface m = new MultipleInheritaceWithInterface();
		m.m1();

	}

}
