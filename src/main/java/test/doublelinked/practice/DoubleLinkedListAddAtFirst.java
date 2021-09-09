package test.doublelinked.practice;



public class DoubleLinkedListAddAtFirst {
	
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
		
		DoubleLinkedListAddAtFirst dla=new DoubleLinkedListAddAtFirst();
		
		dla.insertAtFirst(10);
		dla.insertAtFirst(20);
		dla.insertAtFirst(30);
		dla.display();
	}
	


}
