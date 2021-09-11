package test.DecoratorDesignPattern;



public class FancyDress extends DecoratorClass{

	public FancyDress(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("FancyDress Features");
	}
}