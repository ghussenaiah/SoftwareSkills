package test.facadeDesignPattern;

import java.sql.Driver;

public class Chrome{
	
	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHtmlReport() {
		System.out.println("generate Chrome html report");
	}

	public static void generateJunitReport() {
		System.out.println("generate Chrome junit report");
	}
}
