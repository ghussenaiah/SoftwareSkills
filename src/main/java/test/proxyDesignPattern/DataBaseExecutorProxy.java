package test.proxyDesignPattern;

public class DataBaseExecutorProxy implements DataBaseExecutor {

	boolean isadmin;
	DataBaseExecutorImpl dataBaseExecutorImpl;

	public DataBaseExecutorProxy(String admin, String password) {
		super();
		if (admin.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
			isadmin = true;
			dataBaseExecutorImpl = new DataBaseExecutorImpl();
		}

	}

	public void executeDatabase(String query) throws Exception {

		if (isadmin) {
			dataBaseExecutorImpl.executeDatabase("DELETE");
		} else if (query.equalsIgnoreCase("DELETE")) {
			throw new Exception("u cannot use delete opeartion");
		} else {
			dataBaseExecutorImpl.executeDatabase(query);
		}
	}

}
