package test.sorting.algorithm;

public class InsertionSort {
	
	
	
	public static void main(String args[]) {

		int a[] = { 10, 9,1,8,67,23 };
		int n = a.length;
		int i, j, temp;

		for (i = 1; i < n; i++) {
			
			temp = a[i];

			for (j = i-1;  j>=0; j--) {

				
				if (a[j] > temp) {
					a[j + 1] = a[j];
					a[j] = temp;
				
				}

				/*
				 * if (a[j] > a[j + 1]) {
				 * 
				 * temp = a[j]; a[j + 1] = a[j]; a[j] = temp;
				 * 
				 * }
				 */

			}
		}

		for (i = 0; i < n; i++) {
			System.out.println("new array   => " + a[i]);
		}

	}

}
