package test.general;

import java.util.HashMap;
import java.util.Map;

public class GenericReturnTypeExample {
	
	
	public static class Animal {
    	
    	
        private Map<String,Animal> friends = new HashMap<>();

        public void addFriend(String name, Animal animal){
            friends.put(name,animal);
        }

        public <T> T callFriend(String name){
            return  (T) friends.get(name);
        }
    }

    public static class Dog extends Animal {

        public void bark() {
            System.out.println("i am dog");
        }
    }

    public static class Duck extends Animal {

        public void quack() {
            System.out.println("i am duck");
        }
    }

    public static void main(String [] args) {
        Animal animals = new Animal();
        animals.addFriend("dog", new Dog());
        animals.addFriend("duck", new Duck());

        Dog dog = animals.callFriend("dog");
        dog.bark();

        Duck duck = animals.callFriend("duck");
        duck.quack();

    }
}