package test.logics;



public class AddTwoNumbersUsingTwoLinkedList {



	  Node head1 = null;  
	  Node head2 = null;  
	  class Node{    
	      int data;    
	      Node next;    
	          
	      public Node(int data) {    
	          this.data = data;    
	          this.next = null;    
	      }    
	  }  
	  
	  public void insert(int data) {
		  Node head=head1;
		  head1=addNode(data,head);
	  }
	  
	  public void inserttwo(int data) {
		  Node head=head2;
		  head2= addNode(data,head);
	  }
	  
	  public void reversal1() {
		  Node head=head1;
		  head1= reversal(head);
	  }
	  
	  public void reversal2() {
		  Node head=head2;
		  head2= reversal(head);
	  }
	   
	  public Node addNode(int data,Node head) {
			
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
			return head;
		}   
	      //  100    1        2        3       4  
	      //  head111111  100      200      300     400    NULL 
	  
		public Node reversal(Node head) {
			Node current = head;
			Node previous= null;
			Node temp =null;
			if (head == null) {
				System.out.println("List is empty");
				return null;
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
			// then changing temp as head111111 
			head=temp;
			return head;
		}   
	   
	      
	    
		public void display() {

			Node current = head1;

			if (head1 == null) {
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
		

		public void display2() {

			Node current = head2;

			if (head2 == null) {
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
		
		
		
		public void addTwoLinkedList() {

			Node flist = head1;
			Node slist = head2;

			if (flist == null || slist==null ) {
				System.out.println("List is empty");
				return;
			}
			System.out.println("Nodes of singly linked list: ");
			int carry=0;
			while (flist != null && slist!=null) {

				int data1 = flist.data>0 ? flist.data: 0;
				int data2 = slist.data>0 ? slist.data: 0;
				
				int sum = data1+data2+carry;
				
				flist = flist.next;
				slist = slist.next;
			}
			System.out.println();
		}  
	      
		public static void main(String[] args) {

			AddTwoNumbersUsingTwoLinkedList sList = new AddTwoNumbersUsingTwoLinkedList();

			
			  sList.insert(1);
			  sList.insert(2);
			  sList.insert(3);
			  sList.inserttwo(4);
			  sList.inserttwo(5);
			  sList.inserttwo(6);
			 
			  sList.reversal1();
			  sList.reversal2();
			

			  sList.display();
			  sList.display2();
			 
		}  
}