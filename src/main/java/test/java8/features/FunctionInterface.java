package test.java8.features;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;



class Employee {

	int empno;
	String ename;
	int marks;

	public Employee(int empno, String ename, int marks) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.marks = marks;
	}
	
	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;

	}

}

public class FunctionInterface {

	public static void main(String args[]) {

		Function<Integer, Integer> p = i -> i * i;

		Function<Employee, String> testemp = e -> {
			int marks = e.marks;
			String grade = "";
			if (marks >= 90)
				grade = "A";
			else if (marks >= 50)
				grade = "B";
			else
				grade = "Failed";
			return grade;

		};

		System.out.println("square of the no   -> " + p.apply(10));
		System.out.println("square of the no   -> " + p.apply(11));
		System.out.println("square of the no   -> " + p.apply(12));

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(4, "ABC", 100));
		emp.add(new Employee(3, "XYY", 70));
		emp.add(new Employee(1, "STU", 80));
		emp.add(new Employee(2, "DEF", 25));

		for (Employee e : emp) {

			System.out.println("emp name whose id > 1   -> " + e.ename + " emp id " + e.empno + "Employee Grade -->"
					+ testemp.apply(e));

		}
	}
}
