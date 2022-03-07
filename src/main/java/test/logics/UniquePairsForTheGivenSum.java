package test.logics;

import java.util.HashMap;

public class UniquePairsForTheGivenSum {

	
	
	public static void main(String args[]) {
	
	int[] a= {1,3,2,5,4,3,1};

	int b=2;

	int i,j;

	HashMap<String,String> uniqueValues=new HashMap<>();

	for(i=0;i<=a.length-1; i++)

	     {
		 
		 for(j=i+1;j<=a.length-1; j++)
		 
				if (Math.abs(a[i] - a[j]) == b) {

					// String newKey = reverse(a[i], a[j]);

					uniqueValues.put(a[i] + "" + a[j], a[i] + "," + a[j]);

				}
		}
		 System.out.println(uniqueValues); 
	    }
    }
    

	
