/**
 * 
 */
package test.collectiontest;

import java.util.Map;
import java.util.TreeMap;

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
	}

}
