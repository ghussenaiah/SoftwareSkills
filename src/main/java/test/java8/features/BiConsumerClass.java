package test.java8.features;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerClass {

	
	public static void main(String args[]) {

		BiConsumer<Employee,Integer> empdata = (e,d) -> e.marks=(int) (e.marks+d);

	    ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(4, "ABC", 100));
		emp.add(new Employee(3, "XYY", 70));
		emp.add(new Employee(1, "STU", 80));
		emp.add(new Employee(2, "DEF", 25));

		for (Employee e : emp) {

			empdata.accept(e, 10);

		}

		for (Employee e : emp) {

			System.out.println(e.ename + "---> " + e.marks);

		}

	}
	
	
}
