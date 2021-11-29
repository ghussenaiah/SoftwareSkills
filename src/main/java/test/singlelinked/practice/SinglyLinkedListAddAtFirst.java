package test.singlelinked.practice;



public class SinglyLinkedListAddAtFirst {

	
	  
		Node head = null;   
	    class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    }    
	     
	    public void addNode(int data) {
			
			Node newNode = new Node(data);

			if (head == null) {
				
				head = newNode;
			} else {

				Node node = head;
				while (node != null && node.next != null) {
					node = node.next;
				}
				node.next = newNode;

			}
		}   
	    
	    
		public void InsertAtFirst(int data) {

			Node newNode = new Node(data);

			if (head == null) {

				head = newNode;
			} else {

				Node node = head;
				head = newNode;
				head.next = node;

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
				current = current.next;
			}
			System.out.println();
		}   
	        
		public static void main(String[] args) {

			SinglyLinkedListAddAtFirst sList = new SinglyLinkedListAddAtFirst();

			sList.addNode(1);
			sList.addNode(2);
			sList.addNode(3);
			sList.addNode(4);
			sList.InsertAtFirst(5);
			sList.InsertAtFirst(6);

			sList.display();
		}   
}
