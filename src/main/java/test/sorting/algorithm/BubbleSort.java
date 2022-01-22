package test.sorting.algorithm;



public class BubbleSort {

	public static void main(String args[]) {

		int a[] = { 9, 7, 1, 89, 12, 56 };
		int n = a.length;
		int temp;
		int k = 0;

		for (int i = n; i > 0; i--) {

			for (int j = 0; j < n - 1; j++) {

				// have struggled for j++ or = ++j keep on incrementing so got confusion with
				// increment
				// we can compare by a[j-1]>a[j] like this
				temp = a[j];
				k = j + 1;
				if (a[j] > a[k]) {
					a[j] = a[k];
					a[k] = temp;

				}
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.println("new array   => " + a[i]);
		}
	}
}