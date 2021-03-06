package test.binaryTree;



//Java program to demonstrate
//insert operation in binary
//search tree
class BinarySearchTree {

	
	
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
	BinarySearchTree() {
		root = null;
	}

	// This method mainly calls insertRec()
	void insert(int key) {
		root = insertRec(root, key);
	}
	
	static int max_level = 0;
	 void leftViewUtil(Node node, int level)
	    {
	        // Base Case
	        if (node == null)
	            return;
	 
	        // If this is the first node of its level
	        if (max_level < level) {
	            System.out.print(" " + node.key);
	            max_level = level;
	        }
	 
	        // Recur for left and right subtrees
	        leftViewUtil(node.left, level + 1);
	        leftViewUtil(node.right, level + 1);
	    }
	 
	    // A wrapper over leftViewUtil()
	    void leftView()
	    {
	        leftViewUtil(root, 1);
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
     BinarySearchTree tree = new BinarySearchTree();

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
    // tree.inorder();
     tree.leftView();
 }
}
//This code is contributed by Ankur Narain Verma