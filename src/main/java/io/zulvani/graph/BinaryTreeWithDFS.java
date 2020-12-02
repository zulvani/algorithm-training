package io.zulvani.graph;

public class BinaryTreeWithDFS {

    public BinaryTreeWithDFS() {
        LinkListNode root = new NodeConstructor().construct();
        printInorder(root);
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(LinkListNode node){
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.val + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    public static void main (String[] args){
        new BinaryTreeWithDFS();
    }
}
