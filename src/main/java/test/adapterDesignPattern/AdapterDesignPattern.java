package test.adapterDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		
		WallSocket ws=new WallSocketImpl();
		
		System.out.println(ws.getVolts());
		
		MobileAdapter ma=new MobileAdapterImpl(ws);
		
		System.out.println(ma.get3Volts());
		
	}

}
