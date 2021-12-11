package test.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassExample {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(33);
		list.add(43);
		list.add(53);
		list.add(63);
		list.add(70);
		
		// to check collect only even nos from list 

		List<Integer> m = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(m);
		
		// incremt each value in the list we need to use map in this case
		
		List<Integer> data = list.stream().map(i -> i + 5).collect(Collectors.toList());

		System.out.println(data);
		
		// sort the values in the list
		
		List<Integer> sorteddata = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sorteddata);
		
		
		// sort the values in the list in descdensing order 
		
		List<Integer> sorteddatadesc = list.stream().sorted((a,b)-> (a<b)?1:(a>b)?-1:0).collect(Collectors.toList());

		System.out.println(sorteddatadesc);

		
		// we have discussed about stream(),filter(),map(),count(),min(),max(),sorted()
		
		// here sorted() method internally talks about natural sorting order .. it will use comparable interface method bydefault 
		// for reverse order we need to give some implementation
		
		// difference between comparable and comparator interface is 
		// comparable interface talks abt natural sorting order
		// comparator interfae talks abt customized order 
		
		// for min and max function we need to provide implementation explicitly
		
	}
}
