package test.arrays;



public class Print2DArray {
	   public static void main(String[] args) {
	      final int[][] matrix = {
	         { 1, 2, 3 },
	         { 4, 5, 6 },
	         { 7, 8, 9 }
	      };
	      for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
	            System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	      }
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