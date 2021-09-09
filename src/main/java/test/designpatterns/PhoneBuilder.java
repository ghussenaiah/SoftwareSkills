package test.designpatterns;

public class PhoneBuilder {

	
	private String os;
	private String screensize;
	private String processor;
	private String ram;
	private String cost;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setScreensize(String screensize) {
		this.screensize = screensize;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setCost(String cost) {
		this.cost = cost;
		return this;
	}
	
	@Override
	public String toString() {
		return "PhoneBuilder [os=" + os + ", screensize=" + screensize + ", processor=" + processor + ", ram=" + ram
				+ ", cost=" + cost + "]";
	}
	public Phone getphone() {
		
		return new Phone(os,screensize,processor,ram,cost);
	}
	
}
