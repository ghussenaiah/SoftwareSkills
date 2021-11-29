package practice.tech.DesignPattern.CompositeDesignPattern;

public class Leaf implements Component {

	String name;
	String price;

	public Leaf(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void showprice() {

		System.out.println(name + " -> " + price);
	}
}