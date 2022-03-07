package test.HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

class HashTableWithThread implements Runnable {
	
	 Map<String, Integer> ht = new HashMap<>();
	 
	 
	public void run() {
		
		//   Hashtable<String, Integer> ht = new Hashtable<>();
		   
		  
		   
	          // Adding elements using put method
	        ht.put("vishal", 10);
	        ht.put("sachin", 30);
	        ht.put("vaibhav", 20);
	      
	        System.out.println("=====================> print started <============================");
	          // Iterating using enhanced for loop
	        for (Entry<String, Integer> e : ht.entrySet())
	            System.out.println(e.getKey() + " "+ e.getValue());
	        System.out.println("=>>>>>>>>>>>>>>>>>>>>>>>print end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	        

	}

	public static void main(String args[]) {
		HashTableWithThread m1 = new HashTableWithThread();
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
		
		HashTableWithThread m2 = new HashTableWithThread();
		Thread t2 = new Thread(m2); // Using the constructor Thread(Runnable 
		
		HashTableWithThread m3 = new HashTableWithThread();
		Thread t3 = new Thread(m3); // Using the constructor Thread(Runnable r)
		
		t1.start();
	    t2.start();
		t3.start();
	}
}