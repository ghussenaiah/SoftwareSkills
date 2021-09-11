package test.flyweightDesignPattern;

import java.util.HashMap;
import java.util.Random;


public class EmployeeFactory {

	public static HashMap<String, Employee> map = new HashMap<String, Employee>();
	static Employee e = null;

	public static Employee getEmployee(String type) {

		if (map.get(type) != null) {

			e = map.get(type);
		} else {

			switch (type) {

			case "Developer":
				System.out.println("Developer Created");
				e = new Developer();
				break;

			case "Tester":
				System.out.println("Tester Created");
				e = new Tester();
				break;
			default:

				System.out.println("employee type not found");

			}

			map.put(type, e);

		}
		return e;
	}

}


















