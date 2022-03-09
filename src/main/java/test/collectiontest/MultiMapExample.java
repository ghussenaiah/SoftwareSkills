/**
 * 
 */
package test.collectiontest;

/**
 * @author husenaiah
 *
 */

import java.util.*;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
public class MultiMapExample {

	
	
	 public static void main(String[] args)
	    {
	        // create a multimap from past US presidents list
			
			  Multimap<String, String> multimap = ArrayListMultimap.create();
			  
			  multimap.put("Zachary", "Taylor");
			  multimap.put("John", "Adams");
			  multimap.put("John", "Tyler");
			  multimap.put("John", "Kennedy");
			  multimap.put("George", "Washington");
			  multimap.put("George", "Bush");
			  multimap.put("Grover", "Cleveland");
			  
			  
			  System.out.println("----- Printing Multimap using keySet -----\n"); 
			  
			  for(String lastName: multimap.keySet()) 
			  {
				  System.out.println(lastName + ": " +multimap.get(lastName)); 
				  
			  }
			 
	    }
}
