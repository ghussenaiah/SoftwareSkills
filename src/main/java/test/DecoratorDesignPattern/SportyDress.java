package test.DecoratorDesignPattern;



public class SportyDress extends DecoratorClass{

	public SportyDress(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("SportyDress Features");
		
	}

}
