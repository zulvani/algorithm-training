package io.zulvani.graph;

import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTreeSumWithDFS {

    AtomicInteger counter = new AtomicInteger(0);

    public BinaryTreeSumWithDFS() {

        NodeConstructor nodeConstructor = new NodeConstructor();
        LinkListNode root = nodeConstructor.construct();
        int highest = nodeConstructor.getHighest();
        calculate(root,  highest);
        System.out.println(counter);
    }

    void calculate(LinkListNode node, int highest){
        if (node == null)
            return;

        calculate(node.left, highest);
        counter.set(counter.get() + node.val);
        calculate(node.right, highest);
    }

    public static void main(String[] args){
        new BinaryTreeSumWithDFS();
    }
}
