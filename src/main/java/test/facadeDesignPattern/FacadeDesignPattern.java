package test.facadeDesignPattern;

import java.sql.Driver;

class FireFox{
	
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

class Chrome{
	
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



class facadeDesignclass {
	
	
	
	public static void generateReport(String explorer,String report,String test) {
		
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
