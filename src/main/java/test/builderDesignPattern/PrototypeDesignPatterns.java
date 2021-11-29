package test.designpatterns;

public class PrototypeDesignPatterns {

	public static void main(String args[]) throws CloneNotSupportedException {

		BookShop bs = new BookShop();
		bs.setShopName("new shop");
		bs.fetchData();
		System.out.println(bs);
		BookShop bs1 = (BookShop) bs.clone();
		System.out.println(bs1); 
	}
}
