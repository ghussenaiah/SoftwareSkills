package test.logics;
public class SingleLinkedReversal {


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
      //  100    1        2        3       4  
      //  head  100      200      300     400    NULL 
  
	public void reversal() {
		Node current = head;
		Node previous= null;
		Node temp =null;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current!=null) {
			
			// changing of current link values
			temp=current;
			// traversal of next node
			current=current.next;
			// for first node placing null value // nextnode onwords taking current node as previous node 
			// then for pointing next with old node (previous node)
			temp.next=previous;
			previous=temp;
		}
		// then changing temp as head 
		head=temp;
		System.out.println();
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

		SingleLinkedReversal sList = new SingleLinkedReversal();

		sList.addNode(1);
		sList.addNode(2);
		sList.addNode(3);
		sList.addNode(4);
		sList.addNode(5);
		sList.addNode(6);
		
		sList.reversal();
		

		sList.display();
	} 
}