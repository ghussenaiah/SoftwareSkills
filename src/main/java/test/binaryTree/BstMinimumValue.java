package test.binaryTree;

import test.binaryTree.BinarySearchTree.Node;

public class BstMinimumValue {


	
	Node root;
	
	
 /* Class containing left
    and right child of current node
  * and key value*/
	class Node {
		int key;
		Node left;
		Node right;

		public Node(int item) {
			key = item;
			left = null;
			right = null;
		}
	}

	// Root of BST
	

	// Constructor
	BstMinimumValue() {
		root = null;
	}

	// This method mainly calls insertRec()
	void insert(int key) {
		root = insertRec(root, key);
	}

	/*
	 * A recursive function to insert a new key in BST
	 */
	
	
	Node insertRec(Node root, int key) {

		/*
		 * If the tree is empty, return a new node
		 */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	void inorder() {
		inorderRec(root);
	}
	
	 int minValue() {
		int b=minimunvaue(root);
		return b;
	}

	
	public int minimunvaue(Node root) {
		Node current = root;
		while (current.right != null) {
			current = current.right;
		}
		return (current.key);
	}
	
	// A utility function to
	// do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + "-> ");
			inorderRec(root.right);
		}
	}

 // Driver Code
 public static void main(String[] args)
 {
	 BstMinimumValue tree = new BstMinimumValue();

     /* Let us create following BST
           50
        /     \
       30      70
      /  \    /  \
    20   40  60   80 */
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);

     // print inorder traversal of the BST
     tree.inorder();
  
     
     int k=tree.minValue();
     System.out.println("minimum value is "+k);
     

     
 }

}
