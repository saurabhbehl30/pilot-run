package com.behl.pilotrun.programs.pilotRunV2;


// Class containing left and right child
// of current node and key value
class Node {

    int key;

    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// A Java program to introduce Binary Tree
class BinaryTree {

    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create root
        tree.root = new Node(1);
		/* Following is the tree after above statement
		1
		/ \
		null null
		*/

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
		/* 2 and 3 become left and right children of 1
			1
			/ \
			2 3
		/ \ / \
	null null null null */
        tree.root.left.left = new Node(4);
		/* 4 becomes left child of 2
			1
			/ \
			2 3
			/ \ / \
		4 null null null
		/ \
		null null
		*/

        System.out.println(tree.toString());
    }


    // insert in Binary tree
    Node insertRec(Node root, int key)
    {
        // If the tree is empty,
        // return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }


    // search in Binary Tree
    Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    public  void printPreorder(Node node)
    {
        if (node == null)
            return;

        // Visit node
        System.out.print(node.key + " ");

        // Traverse left subtree
        printPreorder(node.left);

        // Traverse right subtree
        printPreorder(node.right);
    }

    boolean isMirror(Node node1, Node node2)
    {
        // if both trees are empty, then they are mirror image
        if (node1 == null && node2 == null)
            return true;

        // For two trees to be mirror images, the following
        // three conditions must be true
        // 1.) Their root node's key must be same
        // 2.) left subtree of left tree and right subtree
        // of right tree have to be mirror images
        // 3.) right subtree of left tree and left subtree
        // of right tree have to be mirror images
        if (node1 != null && node2 != null
                && node1.key == node2.key)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));

        // if none of the above conditions is true then
        // root1 and root2 are not mirror images
        return false;
    }

}

