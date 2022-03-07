package test.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Print2DArray {
	   public static void main(String[] args) {
		   
		   
	      final int[][] matrix = {
	         { 1, 2, 3 },
	         { 4, 5, 6 },
	         { 7, 8, 9 },
	         { 10,11, 12 },
	      };
	      for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
	            System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println(); 
	      }
	      
	      Random r=new Random();
	      r.doubles(100, 300);
	      System.out.println(""+r.nextInt());
	      
	      int i=0,j=0;
	      List<Integer> an=Arrays.asList(i,j);
	      
	    	   
	  
	   }
      
	}






/*29-11-2021 

09-10            
10-11
11-12              
12-01        
01-02
02-03     started will see how it impact      
03-04
04-05		
05-06     
06-07                 
07-08
08-09
09-10
10-11
11-12


*/

