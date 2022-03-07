/**
 * 
 */
package test.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author husenaiah
 *
 */



public class ListtoSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("college", "Jntu");
		map.put("area", "kukatpally");
		map.put("college", "Ku");
		
		System.out.println(map);
		
		String[] sarry= {"test","Heloo","Hi","How","test"};
	
		List<String> clist=Arrays.asList(sarry);
		
		Set<String> cset=new HashSet<>();
		
		cset.addAll(clist);
		
		for(String s:cset) {
			System.out.println(s);
		}

	}

}
