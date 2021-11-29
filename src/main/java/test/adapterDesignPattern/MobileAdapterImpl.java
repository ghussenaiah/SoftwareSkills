package test.adapterDesignPattern;

public class MobileAdapterImpl implements MobileAdapter{

	public WallSocket wallsocket;

	public MobileAdapterImpl(WallSocket wallsocket) {
		super();
		this.wallsocket = wallsocket;
	}

	public Volts get3Volts() {
		// TODO Auto-generated method stub
		Volts v = wallsocket.getVolts();

		int v1 = v.getVolts() / 80;
		return new Volts(v1);
	}

	@Override
	public String toString() {
		return "MobileAdapterImpl [wallsocket=" + wallsocket + "]";
	}
	
}
