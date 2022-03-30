package test.logics;

import java.util.ArrayList;

public class EmptyArrayInitialValue {

	public static void main(String[] args) {
		
		
		int i = 0;
		double d = 0;
		float f = 0;
		long l = 0;
		String s = null;
		Boolean bb = null;
		
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(s);
		System.out.println(bb);
		
		int a[]=new int[10];
		for(int b: a) {
			System.out.println(b);
		}
		
		//a[9]=1;
		for(int b: a) {
			// System.out.println(b);
		}
		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.ensureCapacity(1);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		
		for(int b: arr) {
			 System.out.println(b);
		}

	}

}
