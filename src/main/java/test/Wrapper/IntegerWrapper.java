/**
 * 
 */
package test.Wrapper;

/**
 * @author husenaiah
 *
 */
public class IntegerWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer i=30;
		test(i);
		System.out.println(i);

	}
	public static void test(Integer i) {
		
		i=50+i;
	}

}
