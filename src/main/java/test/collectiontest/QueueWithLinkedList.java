/**
 * 
 */
package test.collectiontest;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author husenaiah
 *
 */
public class QueueWithLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> str_queue = new LinkedList<>();

		// initialize the queue with values
		str_queue.add("one");
		str_queue.add("two");
		str_queue.add("three");
		str_queue.add("four");

		for (String str : str_queue) {

			System.out.println(str + " ");
		}
		System.out.println("<==>");
		str_queue.poll();
		str_queue.remove();
		str_queue.add("five");
		System.out.println(str_queue.peek() + " ");
		System.out.println(str_queue.element() + " ");

		System.out.println("<==>");
		for (String str : str_queue) {

			System.out.println(str + " ");
		}
	
	}

	

}
