package test.facadeDesignPattern;

public class FacadeDesignExample {

	public static void main(String args[]) {
		
		facadeDesignclass.generateReport("FireFox", "html", "testWebElement");
		facadeDesignclass.generateReport("FireFox", "junit", "testWebElement");
		facadeDesignclass.generateReport("Chrome", "html", "testWebElement");
		facadeDesignclass.generateReport("Chrome", "html", "testWebElement");
		
	}
}
