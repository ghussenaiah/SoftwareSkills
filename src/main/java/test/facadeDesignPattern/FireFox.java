package test.facadeDesignPattern;

import java.sql.Driver;

class FireFox {

	public static Driver getFireFoxDriver() {
		return null;
	}

	public static void generateHtmlReport() {
		System.out.println("generate firefox html report");
	}

	public static void generateJunitReport() {
		System.out.println("generate firefox  junit report");
	}
}