package test.designpatterns;

public class Phone {
	private String os;
	private String screensize;
	private String processor;
	private String ram;
	private String cost;

	public Phone(String os, String screensize, String processor, String ram, String cost) {
		super();
		this.os = os;
		this.screensize = screensize;
		this.processor = processor;
		this.ram = ram;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", screensize=" + screensize + ", processor=" + processor + ", ram=" + ram
				+ ", cost=" + cost + "]";
	}
	
	
	


	

	
	

}
