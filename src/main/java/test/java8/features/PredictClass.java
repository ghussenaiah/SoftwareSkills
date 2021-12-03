package test.java8.features;

import java.util.function.Predicate;

public class PredictClass  {
	
	
	public static void main(String args[]) {
	
	    Predicate<Integer> p=i->i%2==0;
	    
	    System.out.println("even no test   -> "+p.test(10));
	    System.out.println("even no test   -> "+p.test(11));
	    System.out.println("even no test   -> "+p.test(12));
	    
	    
	    
	
	}

}
