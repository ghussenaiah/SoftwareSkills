package test.binaryTree;

import test.binaryTree.BinarySearchTree.Node;

public class BSTleftView {

	Node root;

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

	BSTleftView() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

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
	
	public void leftview() {
		 leftviewDisplay(root, 1,0);
	}
	
	public void leftviewDisplay(Node root,int level,int max_level) {
		
		if (root == null ) 
			return ;
		
		if(max_level<level) {
			
			System.out.println("print the element  ->"+root.key);
			max_level=level;
			}
		
		leftviewDisplay(root.left,level+1,max_level);
		leftviewDisplay(root.right,level+1,max_level);
		
		
	}

	// Driver Code
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.leftView();

		// print inorder traversal of the BST
		;
	}
}
