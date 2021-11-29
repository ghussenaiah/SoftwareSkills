package test.java8.features;



import java.util.ArrayList;
import java.util.List;

public class ForEachClass {

	

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);

		numbers.forEach(n -> System.out.println(n));

	}
}

