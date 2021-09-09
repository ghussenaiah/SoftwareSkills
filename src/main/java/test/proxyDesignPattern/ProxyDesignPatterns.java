package test.proxyDesignPattern;

public class ProxyDesignPatterns {

	public static void main(String[] args) throws Exception {
		
		
		DataBaseExecutor db=new DataBaseExecutorProxy("admin1","password");
		db.executeDatabase("DELETE");

	}

}
