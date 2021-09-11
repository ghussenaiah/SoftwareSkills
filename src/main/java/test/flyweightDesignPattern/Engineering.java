package test.flyweightDesignPattern;

import java.util.Random;

public class Engineering {

	public static String employeeType[] = { "Developer", "Tester" };

	public static void main(String args[]) {

		for (int i = 0; i <= 5; i++) {
			Employee e = EmployeeFactory.getEmployee(getRandom());
			e.task();
		}
	}

	private static String getRandom() {
		Random r = new Random();
		int value = r.nextInt(employeeType.length);
		return employeeType[value];
	};

}