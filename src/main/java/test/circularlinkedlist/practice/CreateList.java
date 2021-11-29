package test.circularlinkedlist.practice;

public class CreateList {  
    //Represents the node of list.  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
      
    //Declaring head and tail pointer as null.  
    public Node head = null;  
    public Node tail = null;  
      
    //This function will add the new node at the end of the list.  
    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {    
            head = newNode;  
            newNode.next = head;  
            tail = newNode;  
        }  
        else {  
              tail.next = newNode; 
              newNode.next = head;  
              tail = newNode;
         }  
    }  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                System.out.print(" "+ current.data);
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
      
    public static void main(String[] args) {  
        CreateList cl = new CreateList();  
        //Adds data to the list  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        //Displays all the nodes present in the list  
        cl.display();  
    }  
}  