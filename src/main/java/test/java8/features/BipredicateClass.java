package test.java8.features;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class BipredicateClass {

	public static void main(String args[]) {

		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;

		System.out.println("even no test   -> " + p.test(10, 20));
		System.out.println("even no test   -> " + p.test(11, 14));

	}
}