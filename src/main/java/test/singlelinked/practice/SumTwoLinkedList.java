package test.singlelinked.practice;

import test.singlelinked.practice.RotateLinkedList.Node;

public class SumTwoLinkedList {

	Node head1=null;
	Node head2=null;
	Node head3=null;
	
	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
	
	
	void insertNode(int value) {

		Node newnode = new Node(value);
		if (head1 == null) {
			head1 = newnode;
		} else {

			Node h = head1;
			while (h.next != null) {

				h = h.next;
			}
			h.next = newnode;
		}

	}
	
	void insertNodeAtSecond(int value) {

		Node newnode = new Node(value);
		if (head2 == null) {
			head2 = newnode;
		} else {

			Node h = head2;
			while (h.next != null) {

				h = h.next;
			}
			h.next = newnode;
		}

	}
	
	void sum(int value) {

		Node newnode = new Node(value);
		if (head3 == null) {
			head3 = newnode;
		} else {

			Node h = head3;
			while (h.next != null) {

				h = h.next;
			}
			h.next = newnode;
		}

	}
	
	
	void display() {

		Node h = head3;
		while (h != null) {

			System.out.print(h.data);
			h = h.next;
		}

	}
	

//  1234  // 9789

//  1  2  3  4
//  9  7  8  9

	
  int carry=0;

	void sumTwoLinkedList() {

		Node h1 = head1;
		Node h2 = head2;

		while (h1 != null && h2 != null) {
			int sum = h1.data + h2.data;
			int newdigit = (carry + sum) % 10;
			carry = (carry + sum) / 10;
			sum(newdigit);
			h1=h1.next;
			h2=h2.next;

		}
		if(carry>0) {
			sum(carry);
		}

	}
	
	public void reversal() {
		Node current = head1;
		Node previous = null;
		Node temp = null;
		if (head1 == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {

			temp = current;
			current = current.next;
			temp.next = previous;
			previous = temp;
		}

		head1 = temp;

	}
	

	public void reversalsecond() {
		Node current = head2;
		Node previous = null;
		Node temp = null;
		if (head2 == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {

			temp = current;
			current = current.next;
			temp.next = previous;
			previous = temp;
		}

		head2 = temp;

	}
	
	
	public static void main(String args[]) {
		SumTwoLinkedList sl=new SumTwoLinkedList();
		sl.insertNode(1);
		sl.insertNode(2);
		sl.insertNode(3);
		sl.insertNode(4);
	
		
		sl.insertNodeAtSecond(9);
		sl.insertNodeAtSecond(7);
		sl.insertNodeAtSecond(8);
		sl.insertNodeAtSecond(9);
	
		sl.reversal();
		sl.reversalsecond();
		sl.sumTwoLinkedList();
		
		sl.display();
		
		// sl.display();
		
	}
}








