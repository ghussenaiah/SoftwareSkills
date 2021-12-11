package test.java8.features;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;





public class BiFunctionCalss {

	public static void main(String args[]) {

		BiFunction<Integer,String,Employee> p = (m,n) -> new Employee(m,n);

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(p.apply(4, "ABC"));
		emp.add(p.apply(1, "ABCG"));
		emp.add(p.apply(5, "ABCK"));
		emp.add(p.apply(3, "ABCL"));

		for (Employee e : emp) {

			System.out.println(e.empno);

		}
	}
}