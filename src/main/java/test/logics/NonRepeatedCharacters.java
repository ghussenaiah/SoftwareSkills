package test.logics;


public class NonRepeatedCharacters {

	public static void main(String[] args) {

		String str = "aabbc";
		int i;
		int arr[] = new int[256];
		System.out.println("array length " + arr.length);
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				int ascii_index = (int) str.charAt(i);
				System.out.println("castAscii " + ascii_index);
				arr[ascii_index]++;
			}
		}
		char ch = ' ';
		System.out.print("All Non-repeating character in a given string is:");
		for (i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == 1) {
				ch = str.charAt(i);
				System.out.print(ch + " ");
			}
		}

	}
}