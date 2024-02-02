package com.behl.pilotrun.programs.test.sample;

public class BinaryTreeSample {

    class Node {

        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;

    void insert(int data) {
        addInsertRecords(root, data);

    }

    void inorder() { inorderRec(root); }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }


    private Node addInsertRecords(Node root, int data) {
        if (root == null) {
            root = new Node(data);

        } else if (data < root.data) {
            root.left = addInsertRecords(root.left, data);
        } else if (data > root.data) {
            root.right = addInsertRecords(root.right, data);
        }
        return root;
    }
}

