package test.builderDesignPattern;

public class PrototypeDesignPatterns {

	public static void main(String args[]) throws CloneNotSupportedException {

		BookShop bs = new BookShop();
		bs.setShopName("new shop");
		bs.fetchData();
		System.out.println(bs);
		 BookShop bs1 = (BookShop) bs.clone();
	   // BookShop bs1 = bs;
		System.out.println(bs1); 
		
		System.out.println("first object address     -> "+bs.toString()); 
		System.out.println("secobd object address    -> "+bs1.toString()); 
		
		if(bs.equals(bs1)) {
			
			System.out.println("data equal");
		}
		else 
		{
			System.out.println("data not equal");
		}
		
		if (bs== bs1) {

			System.out.println("address equal");
		} else {
			System.out.println("address not equal");
		}
		
	}
}
