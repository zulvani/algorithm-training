package io.zulvani.graph;

public class NodeConstructor {

    public LinkListNode construct(){
        LinkListNode left2 = new LinkListNode(3);
        LinkListNode right1 = new LinkListNode(7);
        LinkListNode right2 = new LinkListNode(15, new LinkListNode(13), new LinkListNode(16));
        LinkListNode left1 = new LinkListNode(5, left2, right1);
        LinkListNode root = new LinkListNode(10, left1, right2);
        return root;
    }

    public int getHighest(){
        return 16;
    }
}
