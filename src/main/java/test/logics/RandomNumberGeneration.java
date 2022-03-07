package test.logics;

import java.util.Random;

public class RandomNumberGeneration {
	
	
	
	public static void main(String args[]) {

		Random r = new Random();
		int value = r.nextInt(3);

		System.out.println(value);
		value = r.nextInt(3);

		System.out.println(value);

		value = r.nextInt(3);

		System.out.println(value);

		value = r.nextInt(3);

		System.out.println(value);

		value = r.nextInt(3);

		System.out.println(value);

	}

}
