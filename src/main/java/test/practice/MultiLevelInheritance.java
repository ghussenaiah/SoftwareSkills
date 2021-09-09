package test.practice;



class Animal12 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog12 extends Animal12 {
	void bark() {
		System.out.println("barking...");
	}
	void eat() {
		System.out.println("eating eating...");
	}
}

class BabyDog12 extends Dog12 {
	void weep() {
		System.out.println("weeping...");
	}
	void bark() {
		System.out.println("barking...barking");
	}
}

class MultiLevelInheritance {
	public static void main(String args[]) {
		Dog12 d = new Dog12();
		//d.weep();
		d.bark();
		d.eat();
	}
}
