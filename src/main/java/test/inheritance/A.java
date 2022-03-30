package test.inheritance;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

class B {

	public String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class A extends B {

	public int c;

	public void setC(int c) {

	}

	public int getC() {
		return c;
	}

	public static void main(String args[])
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException

	{
		A a = new A();
		a.setName("sadhasd");
		System.out.println();
		System.out.println(a.getName());

		PropertyUtils.setProperty(a, "name", "TajMahal");
		System.out.println(a.getName());

	}

}
