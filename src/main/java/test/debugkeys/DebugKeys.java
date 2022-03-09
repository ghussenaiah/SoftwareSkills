/**
 * 
 */
package test.debugkeys;

/**
 * @author husenaiah
 *
 */
public class DebugKeys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Heloo new world");
		
		try {
			int k=sum(4,5);
			System.out.println("value of k is "+k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    int num = 33, i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");

	}
	
	
	public static int sum(int a,int b) {
		System.out.println("Heloo new world");
		System.out.println("Heloo new world");
		return a+b;
	}

}
