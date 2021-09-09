package test.DecoratorDesignPattern;

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		
		Dress Casual=new CasualDress(new BasicDress());
		Casual.assemble();
		
		/*
		 * Dress fancyDress=new FancyDress(new BasicDress()); fancyDress.assemble();
		 * 
		 * Dress sportyDress=new SportyDress(new BasicDress()); sportyDress.assemble();
		 */
		
		Dress innner=new CasualDress(new SportyDress(new BasicDress()));
		innner.assemble();
	}

}
