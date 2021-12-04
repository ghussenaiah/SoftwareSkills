package test.java8.features;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	
	int empno;
	String ename;
	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	
}

public class PredictClass {

	public static void main(String args[]) {

		Predicate<Integer> p = i -> i % 2 == 0;

		System.out.println("even no test   -> " + p.test(10));
		System.out.println("even no test   -> " + p.test(11));
		System.out.println("even no test   -> " + p.test(12));

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(4, "ABC"));
		emp.add(new Employee(3, "XYY"));
		emp.add(new Employee(1, "STU"));
		emp.add(new Employee(2, "DEF"));

		Predicate<Employee> empdata = e -> e.empno > 2;

		for (Employee e : emp) {

			if (empdata.test(e)) {
				System.out.println("emp name whose id > 1   -> " + e.ename + " emp id " + e.empno);
			}
		}

	}

}
