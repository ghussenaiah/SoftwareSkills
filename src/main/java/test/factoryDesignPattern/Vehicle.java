package test.factoryDesignPattern;

public interface Vehicle {

	public int getWheel();
}

class Car implements Vehicle {

	int wheel;

	public Car(int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return wheel;

	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + "]";
	}

}

class Bike implements Vehicle {

	int wheel;

	public Bike(int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return wheel;

	}

	@Override
	public String toString() {
		return "Bike [wheel=" + wheel + "]";
	}
}

class FactoryClass {

	public static Vehicle getVehicleFactory(String type, int wheel) {

		if (type.equalsIgnoreCase("Car"))
			return new Car(wheel);
		else if (type.equalsIgnoreCase("Bike"))
			return new Bike(wheel);
		return null;
	}
}


