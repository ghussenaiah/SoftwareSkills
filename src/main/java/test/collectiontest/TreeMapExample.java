/**
 * 
 */
package test.collectiontest;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import test.stream.Employee;

/**
 * @author husenaiah
 *
 */
public class TreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tree_map= new TreeMap<Integer, String>();

		tree_map.put(10, "Geeks");
		tree_map.put(15, "4");
		tree_map.put(20, "Geeks");
		tree_map.put(25, "Welcomes");
		tree_map.put(30, "You");

		for (Map.Entry<Integer, String> m : tree_map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		} 
		
		TreeMap<String, String> tree
        = new TreeMap<String, String>();
		
		tree.put("zg", "Geeks");
		tree.put("kx", "4");
		tree.put("mm", "Geeks");
		tree.put("kg", "Welcomes");
		tree.put("ab", "You");

		for (Map.Entry<String, String> m : tree.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		} 
		
		
		
		
		Set<Employee> abc=new HashSet<Employee>();
		
		Employee e1=new Employee(1,"test",1,400);
		Employee e2=new Employee(1,"test1",1,400);
		Employee e3=new Employee(1,"test",1,400);
		
		abc.add(e1);
		abc.add(e2);
		abc.add(e3);
		System.out.println(abc.size());
		
		for (Employee m : abc) {
			System.out.println(m.geteName());
		} 
				
			
		
		
		
		
	}

}
