package test.java8.features;
import java.util.ArrayList;
import java.util.function.Consumer;

/*class Employee {

	int empno;
	String ename;
	int marks;

	public Employee(int empno, String ename, int marks) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.marks = marks;
	}

}
*/

public class ConsumerInterface {

	public static void main(String args[]) {

		Consumer<String> c1 = c -> System.out.println(c);

		c1.accept("Hello M Consumer");
		
		Consumer<Employee> empdata = e -> System.out.println(e.ename+ "---> "+e.empno);
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(4, "ABC", 100));
		emp.add(new Employee(3, "XYY", 70));
		emp.add(new Employee(1, "STU", 80));
		emp.add(new Employee(2, "DEF", 25));

		for (Employee e : emp) {

			empdata.accept(e);
			
		}

	}

}