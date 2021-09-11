package test.facadeDesignPattern;

import java.sql.Driver;

public class FacadeDesignclass {

	public static void generateReport(String explorer, String report, String test) {

		switch (explorer) {

		case "FireFox":

			FireFox.getFireFoxDriver();

			switch (report) {

			case "html":
				FireFox.generateHtmlReport();
				break;

			case "junit":
				FireFox.generateJunitReport();
				break;

			default:
				System.out.println("printing default values");
			}
			break;

		case "Chrome":
			Chrome.getChromeDriver();

			switch (report) {

			case "html":
				Chrome.generateHtmlReport();
				break;

			case "junit":
				Chrome.generateHtmlReport();
				break;

			default:
				System.out.println("printing default values");
			}
			break;

		default:
			System.out.println("printing default values");
		}
	}

}
