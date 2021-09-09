package test.DecoratorDesignPattern;

public class CasualDress extends DecoratorClass{

	public CasualDress(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Casual Dress Features");
		
	}

}
