package test.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {

	String name;

	public Composite(String name) {
		super();
		this.name = name;
	}

	List<Component> components = new ArrayList<Component>();

	public void addcomponent(Component c) {
		components.add(c);
	}

	public void showprice() {

		System.out.println(name);

		// here c object type will change here depends on attachments
		for (Component c : components) {
			c.showprice();
		}

	}

}


