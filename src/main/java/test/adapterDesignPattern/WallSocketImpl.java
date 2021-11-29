package test.adapterDesignPattern;

public class WallSocketImpl implements WallSocket {

	public Volts getVolts() {
		
		return new Volts(240);
	}

}
