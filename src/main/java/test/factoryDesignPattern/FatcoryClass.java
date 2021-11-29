package test.factoryDesignPattern;

public class FatcoryClass {

	public static void main(String args[]) {

		Vehicle car = FactoryClass.getVehicleFactory("Car", 4);
		System.out.println(car);
		Vehicle bike = FactoryClass.getVehicleFactory("Bike", 2);
		System.out.println(bike);

	}
}
