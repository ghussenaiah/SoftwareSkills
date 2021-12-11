package test.java8.features;

import java.util.function.Consumer;

class Movie {
	
	String name;

	public Movie(String name) {
		this.name = name;
	}

}

public class ConsumerChaining {
	
	public static void main(String args[]) {
		
		Consumer<Movie> c1 = m -> System.out.println(m.name+ "movie released");
		Consumer<Movie> c2 = m -> System.out.println(m.name+ "movie released and blocker buster");
		Consumer<Movie> c3 = m -> System.out.println(m.name+ "movie is awesome");
		
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie m1=new Movie("Spider");
		cc.accept(m1);
	}
	



}
