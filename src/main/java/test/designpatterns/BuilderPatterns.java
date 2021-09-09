package test.designpatterns;

public class BuilderPatterns {

	public static void main(String args[]) {
		// we need to rembember the order of setting values to phone Object
		// Phone p=new Phone("DualCore","5.5","SnapDrangon","2.5","500000");
		// System.out.println(p);
		Phone pb = new PhoneBuilder().setOs("DualCore").setCost("763737736").getphone();
		System.out.println(pb);
	}

}
