package test.doublelinked.practice;


public class DoubleLinkedListInsertAtMiddle {
	
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
			node.left=current;
		}
	}
	
public void insertAtMiddle(int data,int desiredposition) {
	
		
		Node node = new Node(data);
		if (head == null) {
				head = node;
		}
		else {
			Node current=head;
			while(current.right!=null) {
				
				if(current.data==desiredposition) {
					
					node.right=current.right;
					current.right=node;
				}
				current = current.right;
				
			}
			
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
		
		DoubleLinkedListInsertAtMiddle dla=new DoubleLinkedListInsertAtMiddle();
		
		
		dla.insertAtLast(10);
		dla.insertAtLast(20);
		dla.insertAtLast(30);
		dla.insertAtFirst(40);
		dla.insertAtFirst(50);
		dla.insertAtFirst(60);
		dla.insertAtMiddle(99,40);
	    dla.insertAtMiddle(98,99);
	
		dla.display();
	}
	


}
