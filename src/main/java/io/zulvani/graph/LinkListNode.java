package io.zulvani.graph;

public class LinkListNode {

    int val;
    LinkListNode left;
    LinkListNode right;

    public LinkListNode(int val) {
        this.val = val;
    }

    public LinkListNode(int val, LinkListNode left, LinkListNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
