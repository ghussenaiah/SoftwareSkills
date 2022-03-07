package test.sorting.algorithm;


// have struggled for j++ or = ++j keep on incrementing so got confusion with
// increment
// we can compare by a[j-1]>a[j] like this
// k = j + 1;

public class BubbleSort {

	public static void main(String args[]) {

		int a[] = { 9, 7, 1, 89, 12, 56 };
		int n = a.length;
		int temp;
		for (int i = n; i > 0; i--) {

			for (int j = 0; j < n - 1; j++) {

				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("new array   => " + a[i]);
		}
	}
}