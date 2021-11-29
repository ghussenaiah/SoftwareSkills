package test.java8.features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		
	   return (arg0<arg1) ? -1 : (arg0<arg1) ? 1 : 0;
	}
	// lamda expression for above method 
	// (arg0,arg1) -> (arg0<arg1) ? -1 : (arg0<arg1) ? 1 : 0;
	
}

public class LamdaExpressionWithComparator {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(20);
		list.add(8);
		list.add(7);

		System.out.println(list);
		// Collections.sort(list,new MyComparator());
		// System.out.println(list);

		Comparator<Integer> i = (arg0, arg1) -> (arg0 < arg1) ? -1 : (arg0 < arg1) ? 1 : 0;
		Collections.sort(list, i);
		System.out.println(list);

	}

}
