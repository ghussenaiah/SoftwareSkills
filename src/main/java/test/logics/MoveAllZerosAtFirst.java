package test.logics;

import java.util.Arrays;


public class MoveAllZerosAtFirst {

	
	public static void MoveAllZeros(int[] arr) {

		int l = 0;
		int r = arr.length - 1;
		int temp;

		while (l < r) {

			if (arr[l] != 0 && arr[r] == 0) {

				temp = arr[l];

				arr[l] = arr[r];

				arr[r] = temp;

				System.out.println(arr);

			}

			if (arr[l] == 0) 	l++;
			if (arr[r] != 0)    r--;
			
		}

		System.out.println(arr);

	}

	public static void main(String[] args) {
		// int[] arr = { 8, 7, 5, 0, 3, 0 };
		//int[] arr = { 8, 7, 5,9, 3, 4,0 };
		int[] arr = { 8, 0, 5, 0, 3, 0 };
	
		MoveAllZeros(arr);
	}
	
	
}
