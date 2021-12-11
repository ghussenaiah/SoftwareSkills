package test.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceLevel3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("DEF");
		list.add("GHI");
		list.add("JKL");

		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String arg0) {

				System.out.println(arg0);

			};
		});

		// above function we can convert into lamda expression

		list.forEach(arg0 -> System.out.println(arg0));

		// above lamda expression we can convert into method reference .. println method
		// already implemented

		list.forEach(System.out::println);
		
		for(String a: list) {
			System.out.println(a);
		}

	}
}
