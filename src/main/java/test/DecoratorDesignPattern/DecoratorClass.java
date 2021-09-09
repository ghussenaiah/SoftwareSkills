package test.DecoratorDesignPattern;

public class DecoratorClass  implements Dress{
	
	Dress dress;
	

	public DecoratorClass(Dress dress) {
		super();
		this.dress = dress;
	}


	public void assemble() {
		
		this.dress.assemble();
		
	}

}
