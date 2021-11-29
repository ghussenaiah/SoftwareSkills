package test.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	
	public String shopName;
	
	public List<Book> books=new ArrayList<Book>();
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	public void fetchData()
	{
		
		for(int i=0;i<4;i++) {
			Book bok=new Book();
			bok.setBid(i);
			bok.setBname("mybook"+i);
			getBooks().add(bok);
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
