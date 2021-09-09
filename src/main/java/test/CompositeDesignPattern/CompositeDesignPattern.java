package test.CompositeDesignPattern;

public class CompositeDesignPattern {

	public static void main(String[] args) {
		
		
		Component Monitor=new Leaf("Monitor", "4000");
		Component Mouse=new Leaf("Mouse", "1000");
		
		
		Component Harddisk=new Leaf("Harddisk", "5000");
		Component ram=new Leaf("Ram", "7000");
		Component Cpu=new Leaf("Cpu", "9000");
		
		
		Composite computer=new Composite("computer");
		
		
		Composite per=new Composite("perpheral");
		per.addcomponent(Mouse);
		per.addcomponent(Monitor);
		
		computer.addcomponent(per);
		
		
		Composite mb=new Composite("motherboard");

	
		
		mb.addcomponent(Harddisk);
		mb.addcomponent(ram);
		mb.addcomponent(Cpu);
		
	
		computer.addcomponent(mb);
		
		computer.showprice();
		

	}

}
