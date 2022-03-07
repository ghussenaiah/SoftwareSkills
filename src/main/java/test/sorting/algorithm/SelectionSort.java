package test.sorting.algorithm;

public class SelectionSort {

	public static void main(String args[]) {

		int a[] = { 9, 7, 4, 0, 2, 15 };
		int n = a.length;
		int min;

		for (int i = 0; i < n; i++) {

			min = a[i];

			for (int j = i + 1; j < n; j++) {

				if (min > a[j]) {

					a[i] = a[j];
					a[j] = min;
					min = a[i];
				}
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("new array   => " + a[i]);
		}

	}
}
