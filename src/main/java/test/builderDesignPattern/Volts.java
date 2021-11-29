package test.designpatterns;

public class Volts {

	private int volts;

	public Volts(int volts) {
		super();
		this.volts = volts;
	}

	public int getVolts() {
		return volts;
	}

	@Override
	public String toString() {
		return "Volts [volts=" + volts + "]";
	}
	
}
