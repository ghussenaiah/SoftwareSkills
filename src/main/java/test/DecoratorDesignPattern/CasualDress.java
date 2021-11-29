package test.DecoratorDesignPattern;

public class CasualDress extends DecoratorClass{

	public CasualDress(Dress dress) {
		super(dress);
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Casual Dress Features");
	}
}
