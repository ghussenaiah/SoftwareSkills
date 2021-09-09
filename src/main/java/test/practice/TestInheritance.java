package test.practice;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
	
	void eat1() {
		System.out.println("Hello...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}