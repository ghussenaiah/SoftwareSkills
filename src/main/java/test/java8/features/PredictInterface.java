package test.java8.features;

import java.util.ArrayList;
import java.util.function.Predicate;


class EmployeeData {

	int empno;
	String ename;

	public EmployeeData(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

}

public class PredictInterface {

	public static void main(String args[]) {

		Predicate<Integer> p = i -> i % 2 == 0;

		System.out.println("even no test   -> " + p.test(10));
		System.out.println("even no test   -> " + p.test(11));
		System.out.println("even no test   -> " + p.test(12));

		ArrayList<EmployeeData> emp = new ArrayList<EmployeeData>();
		emp.add(new EmployeeData(4, "ABC"));
		emp.add(new EmployeeData(3, "XYY"));
		emp.add(new EmployeeData(1, "STU"));
		emp.add(new EmployeeData(2, "DEF"));

		Predicate<EmployeeData> empdata = e -> e.empno > 2;

		for (EmployeeData e : emp) {

			if (empdata.test(e)) {
				System.out.println("emp name whose id > 1   -> " + e.ename + " emp id " + e.empno);
			}
		}
	}
}
