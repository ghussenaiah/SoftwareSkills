package test.logics;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuranceOfString
{
	static final int ASCII_SIZE = 256;

	static char getMaxOccuringChar(String str) {

		String newString = "Hlldddt";
		char[] charAarayString = newString.toCharArray();

		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> highOccurance = new HashMap<String, Integer>();
		Integer counVariable = 0;
		Integer max = -1;

		for (char ch : charAarayString) {

			String s = Character.toString(ch);
			if (map.containsKey(s)) {

				counVariable = map.get(s);
				counVariable = counVariable + 1;
				map.put(s, counVariable);

			} else {
				map.put(s, 1);
			}
			if (counVariable > max) {
				highOccurance.clear();
				max = counVariable;

				highOccurance.put(s, counVariable);
			}

		}

		System.out.println(map);
		System.out.println(highOccurance);
		return 'a';


	}
	
	public static void main(String[] args)
	{
		String str = "sample string";
		System.out.println("Max occurring character is " +getMaxOccuringChar(str));
	}
}






















