package test.decoratorDesignPattern;

public class DecoratorClass  implements Dress{
	
	Dress dress;

	public DecoratorClass(Dress dress) {
		super();
		this.dress = dress;
		System.out.println("intialifrom DecoratorClass dress");
	}

	public void assemble() {

		this.dress.assemble();

	}

}
