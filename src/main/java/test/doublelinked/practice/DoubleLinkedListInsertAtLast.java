package test.doublelinked.practice;

import test.doublelinked.practice.DoubleLinkedListAddAtFirst.Node;




public class DoubleLinkedListInsertAtLast {
	
Node head=null;
	
	class Node {
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.left=null;
			this.right=null;
			this.data=data;
		}

		
	}
	
public void insertAtFirst(int data) {
	
		
		Node node = new Node(data);
		if (head == null) {
				head = node;
		}
		else {
			Node current=head;
			node.right=current;
			head=node;
		}
	}
	
	
	
	public void insertAtLast(int data) {
	
		
		Node node = new Node(data);
		if (head == null) {
				head = node;
		}
		else {
			Node current=head;
			while(current.right!=null) {
				
				current =current.right;
			}
			current.right=node;
		}
	}
	
	
	public void display() {

		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.right;
		}
		System.out.println();
	} 
	
	public static void main(String args[]) {
		
		DoubleLinkedListInsertAtLast dla=new DoubleLinkedListInsertAtLast();
		
		
		dla.insertAtLast(10);
		dla.insertAtLast(20);
		dla.insertAtLast(30);
		dla.insertAtFirst(40);
		dla.insertAtFirst(50);
		dla.insertAtFirst(60);
	
		dla.display();
	}
	


}
