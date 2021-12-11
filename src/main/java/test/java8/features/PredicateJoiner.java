package test.java8.features;

import java.util.ArrayList;
import java.util.function.Predicate;



public class PredicateJoiner {

	public static void main(String args[]) {

		int[] array = { 23, 12, 5, 26, 27, 13, 14, 11 };
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;

		// print nos which are even and grater than 10
		for (int a : array) {

			if (p1.and(p2).test(a)) {
				System.out.println(a);
			}
		}
		System.out.println("-----------");
		// print nos which are even or grater than 10
		for (int a : array) {

			if (p1.or(p2).test(a)) {
				System.out.println(a);
			}
		}
		System.out.println("-----------");
		// print nos which are not even (opposite to even login)

		for (int a : array) {

			if (p1.negate().test(a)) {
				System.out.println(a);
			}
		}
	}

}

