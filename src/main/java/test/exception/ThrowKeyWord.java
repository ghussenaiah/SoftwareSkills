/**
 * 
 */
package test.exception;

/**
 * @author husenaiah
 *
 */
public class ThrowKeyWord {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
	
		
		for (int i = 3; i > 0; i--)
			try {
				if (i == 2) {
					System.out.println(3 / 0);
				} else {
					System.out.println(3 / i);
				}

			} catch (ArithmeticException e) {
				// System.out.println(e);
				throw new Exception("exception" + e.getStackTrace());
			}

	}

}
